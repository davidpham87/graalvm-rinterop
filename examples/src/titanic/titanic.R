## Title: Prediction of Titanic Survival using Random Forest

## Author: Pradeep Tripathi

## Introduction
## 1.....Load and check data
## 2.....Read Train and Test data
## 3.....Feature engineering
## 4.....Missing value
## 5.....Prediction
## 6.....Variable importance
## 7.....Final Prediction

## Introduction:

## This is my first step at a Kaggle script.I'll use randomForest to create a
## model predicting survival on the Titanic.
## I am new to machine learning and hoping to learn a lot,
## so feedback is very welcome!

## 1....Load Package

list.files("../input")

library('ggplot2')
library('ggthemes')
library('scales')
library('dplyr')
library('mice')
library('randomForest')
library('readr')

## 2.....Read Train and Test data

train <-read.csv('../input/train.csv', stringsAsFactors = F)
test  <-read.csv('../input/test.csv', stringsAsFactors = F)


## Combine both test and train data:

## Explanation: Combining both test and train dataset
## because i am going to use Random forest and it will use Bagging method to
## to create multiple random sample with replacement from dataset. Let say
## it has taken 80% percent of data as random sample,this random sample will be
## treated as Training data and remaining 20%  data (Out of bag sample) will be treated
## as test data.

titanic<-bind_rows(train,test)

## Data check

str(titanic)
summary(titanic)
head(titanic)

## Explanation: We've got a sense of our variables, their class type,
#3 and the first few observations of each. We know we're working with
## 1309 observations of 12 variables.


## 3.....Feature engineering

## We can break down Passenger name into additional meaningful variables
## which can feed predictions or be used in the creation of additional new
## variables. For instance, passenger title is contained within the passenger
## name variable and we can use surname to represent families.

colnames(titanic)

### Retrieve title from passenger names

titanic$title<-gsub('(.*, )|(\\..*)', '', titanic$Name)

# Show title counts by sex

table(titanic$Sex, titanic$title)

## Convert title with low count into new title

unusual_title<-c('Dona', 'Lady', 'the Countess','Capt', 'Col', 'Don',
                 'Dr', 'Major', 'Rev', 'Sir', 'Jonkheer')

## Rename/reassign  Mlle, Ms, and Mme

titanic$title[titanic$title=='Mlle']<-'Miss'
titanic$title[titanic$title=='Ms']<-'Miss'
titanic$title[titanic$title=='Mme']<-'Mrs'
titanic$title[titanic$title %in% unusual_title]<-'Unusual Title'

## Check the title count again

table(titanic$Sex, titanic$title)

## Create variable which contain surnames of passenger name

titanic$surname<-sapply(titanic$Name, function(x) strsplit(x,split='[,.]')[[1]][1])
nlevels(factor(titanic$surname)) ## 875 unique sirname


# Family size variable: We are going to create variable "famsize" to know
# the number of family. it include number of sibling/number of parents
## and children+ passenger themselves

titanic$famsize <- titanic$SibSp + titanic$Parch + 1

# Create a family variable

titanic$family <- paste(titanic$surname, titanic$famsize, sep='_')

## Visualize the relationship between family size & survival

ggplot(titanic[1:891,], aes(x = famsize, fill = factor(Survived))) +
  geom_bar(stat='count', position='dodge') +
  scale_x_continuous(breaks=c(1:11)) +
  labs(x = 'Family Size') +
  theme_few()

## Explanation: We can see that there's a survival penalty to single/alone and
## those with family sizes above 4. We can collapse this variable into three
## levels which will be helpful since there are comparatively fewer large families

## Spit variable into three levels

# Discretize family size

titanic$fsizeD[titanic$famsize == 1] <- 'single'
titanic$fsizeD[titanic$famsize < 5 & titanic$famsize> 1] <- 'small'
titanic$fsizeD[titanic$famsize> 4] <- 'large'


# There's could be some useful information in the passenger cabin variable
## including about their deck, so Retrieve deck from Cabin variable

titanic$Cabin[1:28]

# The first character is the deck:

strsplit(titanic$Cabin[2], NULL) [[1]]

# Deck variable

titanic$deck<-factor(sapply(titanic$Cabin, function(x) strsplit(x, NULL)[[1]][1]))

## 4......Missing value

summary(titanic)

## by using summary function we will get to know which variable has NA value

## Age : 263 miising value
## Fare : 1 missing value
## Embarked : 2 missingvalue
## survived: too many
## Cabin : too many


## Missing value in Embarkment

## Explanation: Now we will explore missing value and rectifying it through
## imputation. There are a number of different ways we could go about doing this.
## Given the small size of the dataset, we probably should not opt for deleting
## either entire observations (rows) or variables (columns) containing missing
## values. We're left with the option of either replacing missing values with a
## sensible values given the distribution of the data, e.g., the mean, median
## or mode.


## ## To know which passengers have no listed embarkment port

titanic$Embarked[titanic$Embarked == ""] <- NA

titanic[(which(is.na(titanic$Embarked))), 1]

# Explanation: Passengers 62 and 830 are missing Embarkment

titanic[c(62, 830), 'Embarked']

## So Passenger numbers 62 and 830 are each missing their embarkment ports.
## Let's look at their class of ticket and their fare.

titanic[c(62, 830), c(1,3,10)]

## Both passengers had first class tickets that they spent 80 (pounds?) on.
## Let's see the embarkment ports of others who bought similar kinds of tickets.

## first way of handling missing value in embarked

titanic%>%
  group_by(Embarked, Pclass) %>%
  filter(Pclass == "1") %>%
  summarise(mfare = median(Fare),n = n())

## Looks like the median price for a first class ticket departing from 'C'
## (Charbourg) was 77 (in comparison to our 80). While first class tickets
## departing from 'Q' were only slightly more expensive (median price 90),
## only 3 first class passengers departed from that port. It seems far
## more likely that passengers 62 and 830 departed with the other 141
## first-class passengers from Charbourg.

## Second Way of handling missing value in embarked

embark_fare <- titanic %>%
  filter(PassengerId != 62 & PassengerId != 830)
embark_fare

# Use ggplot2 to visualize embarkment, passenger class, & median fare

ggplot(embark_fare, aes(x = Embarked, y = Fare, fill = factor(Pclass))) +
  geom_boxplot() +
  geom_hline(aes(yintercept=80),
             colour='red', linetype='dashed', lwd=2) +
  scale_y_continuous(labels=dollar_format()) +
  theme_few()

## from plot we can see that The median fare for a first class passenger
## departing from Charbourg ('C') coincides nicely with the $80 paid by our
## embarkment-deficient passengers. I think we can safely replace the NA values
## with 'C'.

# Since their fare was $80 for 1st class, they most likely embarked from 'C'

titanic$Embarked[c(62, 830)] <- 'C'


## Missing value in fare

## ## to know Which passenger has no fare information

titanic[(which(is.na(titanic$Fare))) , 1]

## Looks like Passenger number 1044 has no listed Fare

# Where did this passenger leave from? What was their class?

titanic[1044, c(3, 12)]

# Another way to know about passenger id 1044 :Show row 1044

titanic[1044, ]

## Looks like he left from 'S' (Southampton) as a 3rd class passenger.
## Let's see what other people of the same class and embarkment port paid for
## their tickets.

## First way:

titanic%>%
  filter(Pclass == '3' & Embarked == 'S') %>%
  summarise(missing_fare = median(Fare, na.rm = TRUE))

## Looks like the median cost for a 3rd class passenger leaving out of
## Southampton was 8.05. That seems like a logical value for this passenger
## to have paid.

## Second way:

ggplot(titanic[titanic$Pclass == '3' & titanic$Embarked == 'S', ],
       aes(x = Fare)) +
  geom_density(fill = '#99d6ff', alpha=0.4) +
  geom_vline(aes(xintercept=median(Fare, na.rm=T)),
             colour='red', linetype='dashed', lwd=1) +
  scale_x_continuous(labels=dollar_format()) +
  theme_few()

## From this visualization, it seems quite reasonable to replace the NA Fare
## value with median for their class and embarkment which is $8.05.

## Replace that NA with 8.05

titanic$Fare[1044] <- 8.05
summary(titanic$Fare)

### Another way of Replace missing fare value with median fare for class/embarkment

titanic$Fare[1044] <- median(titanic[titanic$Pclass == '3' & titanic$Embarked == 'S', ]$Fare, na.rm = TRUE)


## Missing Value in Age

# Show number of missing Age values

sum(is.na(titanic$Age))

## 263 passengers have no age listed. Taking a median age of all passengers
## doesn't seem like the best way to solve this problem, so it may be easiest to
## try to predict the passengers' age based on other known information.

## To predict missing ages, but I'm going to use the mice package. To start with
## i will factorize the factor variables and then perform
## mice(multiple imputation using chained equations).

# Set a random seed

set.seed(129)

# Perform mice imputation, excluding certain less-than-useful variables:

mice_mod <- mice(titanic[, !names(titanic) %in% c('PassengerId','Name','Ticket','Cabin','Family','Surname','Survived')], method='rf')

# Save the complete output

mice_output <- complete(mice_mod)


## Let's compare the results we get with the original distribution of
## passenger ages to ensure that nothing has gone completely awry.

# Plot age distributions

par(mfrow=c(1,2))
hist(titanic$Age, freq=F, main='Age: Original Data',
     col='darkred', ylim=c(0,0.04))
hist(mice_output$Age, freq=F, main='Age: MICE Output',
     col='lightgreen', ylim=c(0,0.04))

## Things look good, so let's replace our age vector in the original data
## with the output from the mice model.

# Replace Age variable from the mice model

titanic$Age <- mice_output$Age

# Show new number of missing Age values

sum(is.na(titanic$Age))


## Feature Enginnering: Part 2

## I will create a couple of new age-dependent variables: Child and Mother.
## A child will simply be someone under 18 years of age and
## a mother is a passenger who is 1) female, 2) is over 18, 3) has more
## than 0 children and 4) does not have the title 'Miss'

# Relationship between age & survival:# I include Sex since we know
## it's a significant predictor

ggplot(titanic[1:891,], aes(Age, fill = factor(Survived))) +
  geom_histogram() + facet_grid(.~Sex) + theme_few()

# Create the column child, and indicate whether child or adult

titanic$Child[titanic$Age < 18] <- 'Child'
titanic$Child[titanic$Age >= 18] <- 'Adult'

# Show counts

table(titanic$Child, titanic$Survived)

## Adding Mother variable

titanic$Mother <- 'Not Mother'
titanic$Mother[titanic$Sex == 'female' & titanic$Parch >0 & titanic$Age > 18 & titanic$title != 'Miss'] <- 'Mother'

# Show counts

table(titanic$Mother, titanic$Survived)

## Factorizing variables

titanic$Child  <- factor(titanic$Child)
titanic$Mother <- factor(titanic$Mother)
titanic$Pclass<-factor(titanic$Pclass)
titanic$Sex<-factor(titanic$Sex)
titanic$Embarked<-factor(titanic$Embarked)
titanic$Survived<-factor(titanic$Survived)
titanic$title<-factor(titanic$title)
titanic$fsizeD<-factor(titanic$fsizeD)



##5......Prediction

## Split into training & test sets

train <- titanic[1:891,]
test <- titanic[892:1309,]


## Building the model
## We then build our model using randomForest on the training set.

# Set a random seed

set.seed(754)

# Build the model (note: not all possible variables are used)

titanic_model <- randomForest(Survived ~ Pclass + Sex + Age + SibSp + Parch +
                                Fare + Embarked + title +
                                fsizeD + Child + Mother,
                              data = train)


# Show model error

plot(titanic_model, ylim=c(0,0.36))
legend('topright', colnames(titanic_model$err.rate), col=1:3, fill=1:3)

## The black line shows the overall error rate which falls below 20%.
## The red and green lines show the error rate for 'died' and 'survived'
## respectively. We can see that right now we're much more successful predicting
## death than we are survival.



### 6...Variable importance

# Get importance

importance    <- importance(titanic_model)
varImportance <- data.frame(Variables = row.names(importance),
                            Importance = round(importance[ ,'MeanDecreaseGini'],2))

# Create a rank variable based on importance

rankImportance <- varImportance %>%
  mutate(Rank = paste0('#',dense_rank(desc(Importance))))

# Use ggplot2 to visualize the relative importance of variables

ggplot(rankImportance, aes(x = reorder(Variables, Importance),
                           y = Importance, fill = Importance)) +
  geom_bar(stat='identity') +
  geom_text(aes(x = Variables, y = 0.5, label = Rank),
            hjust=0, vjust=0.55, size = 4, colour = 'red') +
  labs(x = 'Variables') +
  coord_flip() +
  theme_few()


## From the plot we can see that title variable has the highest
## relative importance out of all of our predictor variables


### 7...Final Prediction

# Predict using the test set

prediction <- predict(titanic_model, test)
prediction

# Save the solution to a dataframe with two columns: PassengerId and Survived (prediction)

Output<- data.frame(PassengerID = test$PassengerId, Survived = prediction)
Output

# Write the Output to file

write.csv(Output, file = 'pradeep_titanic_output.csv', row.names = F)

## Conclusion: Thank you for taking the time to read through my first
## exploration of a Titanic Kaggle dataset. Again, this newbie welcomes comments and suggestions!
