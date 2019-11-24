(ns r-interop.packages.utils
 (:require [r-interop.core :refer (defn-r eval-r)]))

(defn-r get-cran-mirrors getCRANmirrors)
(defn-r get-s3-method getS3method)
(defn-r glob->rx glob2rx)
(defn-r is-s3-method isS3method)
(defn-r is-s3-std-generic isS3stdGeneric)
(defn-r mirror->html mirror2html)

(def adist
 ^{:name-r "adist",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :costs nil,
    :counts false,
    :fixed true,
    :partial {},
    :ignore.case false,
    :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "adist"))

(def alarm
 ^{:name-r "alarm", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "alarm"))

(def apropos
 ^{:name-r "apropos",
  :doc "",
  :argslists
  ({:what nil, :where false, :ignore.case true, :mode "any"})}
 (r-interop.core/->clj-pos-kw-fn "apropos"))

(def aregexec
 ^{:name-r "aregexec",
  :doc "",
  :argslists
  ({:pattern nil,
    :text nil,
    :max.distance 0.1,
    :costs nil,
    :ignore.case false,
    :fixed false,
    :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "aregexec"))

(def args-anywhere
 ^{:name-r "argsAnywhere", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "argsAnywhere"))

(def as-person
 ^{:name-r "as.person", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "as.person"))

(def as-person-list
 ^{:name-r "as.personList", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "as.personList"))

(def as-relistable
 ^{:name-r "as.relistable", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "as.relistable"))

(def as-roman
 ^{:name-r "as.roman", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "as.roman"))

(def as-date-built
 ^{:name-r "asDateBuilt", :doc "", :argslists ({:built nil})}
 (r-interop.core/->clj-pos-kw-fn "asDateBuilt"))

(def ask-yes-no
 ^{:name-r "askYesNo",
  :doc "",
  :argslists ({:msg nil, :default true, :prompts {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "askYesNo"))

(def aspell
 ^{:name-r "aspell",
  :doc "",
  :argslists
  ({:files nil,
    :filter nil,
    :control {},
    :encoding "unknown",
    :program nil,
    :dictionaries {}})}
 (r-interop.core/->clj-pos-kw-fn "aspell"))

(def aspell-package-c-files
 ^{:name-r "aspell_package_C_files",
  :doc "",
  :argslists
  ({:dir nil,
    :ignore {},
    :control {},
    :program nil,
    :dictionaries {}})}
 (r-interop.core/->clj-pos-kw-fn "aspell_package_C_files"))

(def aspell-package-r-files
 ^{:name-r "aspell_package_R_files",
  :doc "",
  :argslists
  ({:dir nil,
    :ignore {},
    :control {},
    :program nil,
    :dictionaries {}})}
 (r-interop.core/->clj-pos-kw-fn "aspell_package_R_files"))

(def aspell-package-rd-files
 ^{:name-r "aspell_package_Rd_files",
  :doc "",
  :argslists
  ({:dir nil, :drop {}, :control {}, :program nil, :dictionaries {}})}
 (r-interop.core/->clj-pos-kw-fn "aspell_package_Rd_files"))

(def aspell-package-vignettes
 ^{:name-r "aspell_package_vignettes",
  :doc "",
  :argslists ({:dir nil, :control {}, :program nil, :dictionaries {}})}
 (r-interop.core/->clj-pos-kw-fn "aspell_package_vignettes"))

(def aspell-write-personal-dictionary-file
 ^{:name-r "aspell_write_personal_dictionary_file",
  :doc "",
  :argslists ({:x nil, :out nil, :language "en", :program nil})}
 (r-interop.core/->clj-pos-kw-fn
  "aspell_write_personal_dictionary_file"))

(def assign-in-my-namespace
 ^{:name-r "assignInMyNamespace",
  :doc "",
  :argslists ({:x nil, :value nil})}
 (r-interop.core/->clj-pos-kw-fn "assignInMyNamespace"))

(def assign-in-namespace
 ^{:name-r "assignInNamespace",
  :doc "",
  :argslists ({:x nil, :value nil, :ns nil, :pos {}, :envir {}})}
 (r-interop.core/->clj-pos-kw-fn "assignInNamespace"))

(def available-packages
 ^{:name-r "available.packages",
  :doc "",
  :argslists
  ({:filters nil,
    :method nil,
    :ignore_repo_cache false,
    :fields nil,
    :type {},
    :repos {},
    :contriburl {},
    :... nil,
    :max_repo_cache_age nil})}
 (r-interop.core/->clj-pos-kw-fn "available.packages"))

(def bibentry
 ^{:name-r "bibentry",
  :doc "",
  :argslists
  ({:key nil,
    :other {},
    :bibtype nil,
    :footer nil,
    :header nil,
    :mfooter nil,
    :... nil,
    :mheader nil,
    :textVersion nil})}
 (r-interop.core/->clj-pos-kw-fn "bibentry"))

(def browse-env
 ^{:name-r "browseEnv",
  :doc "",
  :argslists
  ({:envir nil,
    :pattern nil,
    :excludepatt "^last\\.warning",
    :html {},
    :expanded true,
    :properties nil,
    :main nil,
    :debugMe false})}
 (r-interop.core/->clj-pos-kw-fn "browseEnv"))

(def browse-url
 ^{:name-r "browseURL",
  :doc "",
  :argslists ({:url nil, :browser {}, :encodeIfNeeded false})}
 (r-interop.core/->clj-pos-kw-fn "browseURL"))

(def browse-vignettes
 ^{:name-r "browseVignettes",
  :doc "",
  :argslists ({:package nil, :lib.loc nil, :all true})}
 (r-interop.core/->clj-pos-kw-fn "browseVignettes"))

(def bug-report
 ^{:name-r "bug.report",
  :doc "",
  :argslists
  ({:subject "",
    :address nil,
    :file "R.bug.report",
    :package nil,
    :lib.loc nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "bug.report"))

(def capture-output
 ^{:name-r "capture.output",
  :doc "",
  :argslists
  ({:... nil, :file nil, :append false, :type {}, :split false})}
 (r-interop.core/->clj-pos-kw-fn "capture.output"))

(def changed-files
 ^{:name-r "changedFiles",
  :doc "",
  :argslists
  ({:path {},
    :digest {},
    :full.names {},
    :after nil,
    :... nil,
    :check.file.info {},
    :md5sum {},
    :timestamp {},
    :before nil})}
 (r-interop.core/->clj-pos-kw-fn "changedFiles"))

(def check-cran
 ^{:name-r "checkCRAN", :doc "", :argslists ({:method nil})}
 (r-interop.core/->clj-pos-kw-fn "checkCRAN"))

(def choose-bio-cmirror
 ^{:name-r "chooseBioCmirror",
  :doc "",
  :argslists ({:graphics {}, :ind nil, :local.only false})}
 (r-interop.core/->clj-pos-kw-fn "chooseBioCmirror"))

(def choose-cra-nmirror
 ^{:name-r "chooseCRANmirror",
  :doc "",
  :argslists ({:graphics {}, :ind nil, :local.only false})}
 (r-interop.core/->clj-pos-kw-fn "chooseCRANmirror"))

(def citation
 ^{:name-r "citation",
  :doc "",
  :argslists ({:package "base", :lib.loc nil, :auto nil})}
 (r-interop.core/->clj-pos-kw-fn "citation"))

(def cite
 ^{:name-r "cite",
  :doc "",
  :argslists ({:keys nil, :bib nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "cite"))

(def cite-natbib
 ^{:name-r "citeNatbib",
  :doc "",
  :argslists
  ({:textual false,
    :bib nil,
    :longnamesfirst true,
    :bibpunct {},
    :mode {},
    :abbreviate true,
    :keys nil,
    :after nil,
    :previous nil,
    :before nil})}
 (r-interop.core/->clj-pos-kw-fn "citeNatbib"))

(def cit-entry
 ^{:name-r "citEntry",
  :doc "",
  :argslists
  ({:entry nil, :textVersion nil, :header nil, :footer nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "citEntry"))

(def cit-footer
 ^{:name-r "citFooter", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "citFooter"))

(def cit-header
 ^{:name-r "citHeader", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "citHeader"))

(def close-socket
 ^{:name-r "close.socket",
  :doc "",
  :argslists ({:socket nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "close.socket"))

(def combn
 ^{:name-r "combn",
  :doc "",
  :argslists ({:x nil, :m nil, :FUN nil, :simplify true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "combn"))

(def compare-version
 ^{:name-r "compareVersion", :doc "", :argslists ({:a nil, :b nil})}
 (r-interop.core/->clj-pos-kw-fn "compareVersion"))

(def contrib-url
 ^{:name-r "contrib.url", :doc "", :argslists ({:repos nil, :type {}})}
 (r-interop.core/->clj-pos-kw-fn "contrib.url"))

(def count-fields
 ^{:name-r "count.fields",
  :doc "",
  :argslists
  ({:file nil,
    :sep "",
    :quote "\"'",
    :skip 0,
    :blank.lines.skip true,
    :comment.char "#"})}
 (r-interop.core/->clj-pos-kw-fn "count.fields"))

(def cran-packages
 ^{:name-r "CRAN.packages",
  :doc "",
  :argslists ({:CRAN {}, :method nil, :contriburl {}})}
 (r-interop.core/->clj-pos-kw-fn "CRAN.packages"))

(def create-post
 ^{:name-r "create.post",
  :doc "",
  :argslists
  ({:instructions {},
    :description "post",
    :subject "",
    :method {},
    :address "the relevant mailing list",
    :ccaddress {},
    :filename "R.post",
    :info {}})}
 (r-interop.core/->clj-pos-kw-fn "create.post"))

(def data
 ^{:name-r "data",
  :doc "",
  :argslists
  ({:... nil,
    :list {},
    :package nil,
    :lib.loc nil,
    :verbose {},
    :envir nil})}
 (r-interop.core/->clj-pos-kw-fn "data"))

(def data-entry
 ^{:name-r "data.entry",
  :doc "",
  :argslists ({:... nil, :Modes nil, :Names nil})}
 (r-interop.core/->clj-pos-kw-fn "data.entry"))

(def dataentry
 ^{:name-r "dataentry", :doc "", :argslists ({:data nil, :modes nil})}
 (r-interop.core/->clj-pos-kw-fn "dataentry"))

(def de
 ^{:name-r "de",
  :doc "",
  :argslists ({:... nil, :Modes {}, :Names nil})}
 (r-interop.core/->clj-pos-kw-fn "de"))

(def de-ncols
 ^{:name-r "de.ncols", :doc "", :argslists ({:inlist nil})}
 (r-interop.core/->clj-pos-kw-fn "de.ncols"))

(def de-restore
 ^{:name-r "de.restore",
  :doc "",
  :argslists
  ({:inlist nil, :ncols nil, :coltypes nil, :argnames nil, :args nil})}
 (r-interop.core/->clj-pos-kw-fn "de.restore"))

(def de-setup
 ^{:name-r "de.setup",
  :doc "",
  :argslists ({:ilist nil, :list.names nil, :incols nil})}
 (r-interop.core/->clj-pos-kw-fn "de.setup"))

(def debugcall
 ^{:name-r "debugcall", :doc "", :argslists ({:call nil, :once false})}
 (r-interop.core/->clj-pos-kw-fn "debugcall"))

(def debugger
 ^{:name-r "debugger", :doc "", :argslists ({:dump nil})}
 (r-interop.core/->clj-pos-kw-fn "debugger"))

(def demo
 ^{:name-r "demo",
  :doc "",
  :argslists
  ({:topic nil,
    :package nil,
    :lib.loc nil,
    :character.only false,
    :verbose {},
    :echo true,
    :ask {},
    :encoding {}})}
 (r-interop.core/->clj-pos-kw-fn "demo"))

(def download-file
 ^{:name-r "download.file",
  :doc "",
  :argslists
  ({:url nil,
    :destfile nil,
    :method nil,
    :quiet false,
    :mode "w",
    :cacheOK true,
    :extra {},
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "download.file"))

(def download-packages
 ^{:name-r "download.packages",
  :doc "",
  :argslists
  ({:pkgs nil,
    :destdir nil,
    :available nil,
    :repos {},
    :contriburl {},
    :method nil,
    :type {},
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "download.packages"))

(def dump-frames
 ^{:name-r "dump.frames",
  :doc "",
  :argslists
  ({:dumpto "last.dump", :to.file false, :include.GlobalEnv false})}
 (r-interop.core/->clj-pos-kw-fn "dump.frames"))

(def edit
 ^{:name-r "edit", :doc "", :argslists ({:name nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "edit"))

(def emacs
 ^{:name-r "emacs", :doc "", :argslists ({:name nil, :file ""})}
 (r-interop.core/->clj-pos-kw-fn "emacs"))

(def example
 ^{:name-r "example",
  :doc "",
  :argslists
  ({:prompt.prefix {},
    :package nil,
    :lib.loc nil,
    :give.lines false,
    :character.only false,
    :verbose {},
    :topic nil,
    :run.donttest {},
    :setRNG false,
    :echo true,
    :run.dontrun false,
    :local false,
    :ask {}})}
 (r-interop.core/->clj-pos-kw-fn "example"))

(def file-test
 ^{:name-r "file_test", :doc "", :argslists ({:op nil, :x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "file_test"))

(def file-edit
 ^{:name-r "file.edit",
  :doc "",
  :argslists ({:... nil, :title nil, :editor {}, :fileEncoding ""})}
 (r-interop.core/->clj-pos-kw-fn "file.edit"))

(def file-snapshot
 ^{:name-r "fileSnapshot",
  :doc "",
  :argslists
  ({:path ".",
    :file.info true,
    :timestamp nil,
    :md5sum false,
    :digest nil,
    :full.names {},
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "fileSnapshot"))

(def find
 ^{:name-r "find",
  :doc "",
  :argslists
  ({:what nil, :mode "any", :numeric false, :simple.words true})}
 (r-interop.core/->clj-pos-kw-fn "find"))

(def find-line-num
 ^{:name-r "findLineNum",
  :doc "",
  :argslists
  ({:srcfile nil, :line nil, :nameonly true, :envir {}, :lastenv nil})}
 (r-interop.core/->clj-pos-kw-fn "findLineNum"))

(def fix
 ^{:name-r "fix", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "fix"))

(def fix-in-namespace
 ^{:name-r "fixInNamespace",
  :doc "",
  :argslists ({:x nil, :ns nil, :pos {}, :envir {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "fixInNamespace"))

(def flush-console
 ^{:name-r "flush.console", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "flush.console"))

(def format-ol
 ^{:name-r "formatOL",
  :doc "",
  :argslists
  ({:x nil, :type "arabic", :offset 0, :start 1, :width {}})}
 (r-interop.core/->clj-pos-kw-fn "formatOL"))

(def format-ul
 ^{:name-r "formatUL",
  :doc "",
  :argslists ({:x nil, :label "*", :offset 0, :width {}})}
 (r-interop.core/->clj-pos-kw-fn "formatUL"))

(def get-anywhere
 ^{:name-r "getAnywhere", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "getAnywhere"))

(def get-from-namespace
 ^{:name-r "getFromNamespace",
  :doc "",
  :argslists ({:x nil, :ns nil, :pos {}, :envir {}})}
 (r-interop.core/->clj-pos-kw-fn "getFromNamespace"))

(def get-parse-data
 ^{:name-r "getParseData",
  :doc "",
  :argslists ({:x nil, :includeText [nil]})}
 (r-interop.core/->clj-pos-kw-fn "getParseData"))

(def get-parse-text
 ^{:name-r "getParseText",
  :doc "",
  :argslists ({:parseData nil, :id nil})}
 (r-interop.core/->clj-pos-kw-fn "getParseText"))

(def get-src-directory
 ^{:name-r "getSrcDirectory",
  :doc "",
  :argslists ({:x nil, :unique true})}
 (r-interop.core/->clj-pos-kw-fn "getSrcDirectory"))

(def get-src-filename
 ^{:name-r "getSrcFilename",
  :doc "",
  :argslists ({:x nil, :full.names false, :unique true})}
 (r-interop.core/->clj-pos-kw-fn "getSrcFilename"))

(def get-src-location
 ^{:name-r "getSrcLocation",
  :doc "",
  :argslists ({:x nil, :which {}, :first true})}
 (r-interop.core/->clj-pos-kw-fn "getSrcLocation"))

(def get-srcref
 ^{:name-r "getSrcref", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "getSrcref"))

(def get-txt-progress-bar
 ^{:name-r "getTxtProgressBar", :doc "", :argslists ({:pb nil})}
 (r-interop.core/->clj-pos-kw-fn "getTxtProgressBar"))

(def global-variables
 ^{:name-r "globalVariables",
  :doc "",
  :argslists ({:names nil, :package nil, :add true})}
 (r-interop.core/->clj-pos-kw-fn "globalVariables"))

(def has-name
 ^{:name-r "hasName", :doc "", :argslists ({:x nil, :name nil})}
 (r-interop.core/->clj-pos-kw-fn "hasName"))

(def head
 ^{:name-r "head", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "head"))

(def head-matrix
 ^{:name-r "head.matrix",
  :doc "",
  :argslists ({:x nil, :n 6, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "head.matrix"))

(def help
 ^{:name-r "help",
  :doc "",
  :argslists
  ({:topic nil,
    :package nil,
    :lib.loc nil,
    :verbose {},
    :try.all.packages {},
    :help_type {}})}
 (r-interop.core/->clj-pos-kw-fn "help"))

(def help-request
 ^{:name-r "help.request",
  :doc "",
  :argslists
  ({:subject "",
    :address "r-help@R-project.org",
    :file "R.help.request",
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "help.request"))

(def help-search
 ^{:name-r "help.search",
  :doc "",
  :argslists
  ({:package nil,
    :use_UTF8 false,
    :whatis nil,
    :help.db {},
    :lib.loc nil,
    :ignore.case true,
    :fields {},
    :verbose {},
    :types {},
    :rebuild false,
    :keyword nil,
    :agrep nil,
    :apropos nil,
    :pattern nil})}
 (r-interop.core/->clj-pos-kw-fn "help.search"))

(def help-start
 ^{:name-r "help.start",
  :doc "",
  :argslists
  ({:update false, :gui "irrelevant", :browser {}, :remote nil})}
 (r-interop.core/->clj-pos-kw-fn "help.start"))

(def history
 ^{:name-r "history",
  :doc "",
  :argslists ({:max.show 25, :reverse false, :pattern nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "history"))

(def hsearch-db
 ^{:name-r "hsearch_db",
  :doc "",
  :argslists
  ({:package nil,
    :lib.loc nil,
    :types {},
    :verbose {},
    :rebuild false,
    :use_UTF8 false})}
 (r-interop.core/->clj-pos-kw-fn "hsearch_db"))

(def hsearch-db-concepts
 ^{:name-r "hsearch_db_concepts", :doc "", :argslists ({:db {}})}
 (r-interop.core/->clj-pos-kw-fn "hsearch_db_concepts"))

(def hsearch-db-keywords
 ^{:name-r "hsearch_db_keywords", :doc "", :argslists ({:db {}})}
 (r-interop.core/->clj-pos-kw-fn "hsearch_db_keywords"))

(def install-fastr-packages
 ^{:name-r "install.fastr.packages",
  :doc "",
  :argslists ({:pkgs nil, :lib nil, :INSTALL_opts {}})}
 (r-interop.core/->clj-pos-kw-fn "install.fastr.packages"))

(def install-packages
 ^{:name-r "install.packages",
  :doc "",
  :argslists
  ({:libs_only false,
    :quiet false,
    :INSTALL_opts nil,
    :configure.args {},
    :configure.vars {},
    :method nil,
    :type {},
    :verbose {},
    :repos {},
    :destdir nil,
    :contriburl {},
    :... nil,
    :Ncpus {},
    :lib nil,
    :available nil,
    :pkgs nil,
    :dependencies [nil],
    :keep_outputs false,
    :clean false})}
 (r-interop.core/->clj-pos-kw-fn "install.packages"))

(def installed-packages
 ^{:name-r "installed.packages",
  :doc "",
  :argslists
  ({:lib.loc nil,
    :priority nil,
    :noCache false,
    :fields nil,
    :subarch {},
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "installed.packages"))

(def is-relistable
 ^{:name-r "is.relistable", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "is.relistable"))

(def limited-labels
 ^{:name-r "limitedLabels",
  :doc "",
  :argslists ({:value nil, :maxwidth {}})}
 (r-interop.core/->clj-pos-kw-fn "limitedLabels"))

(def loadhistory
 ^{:name-r "loadhistory", :doc "", :argslists ({:file ".Rhistory"})}
 (r-interop.core/->clj-pos-kw-fn "loadhistory"))

(def locale-to-charset
 ^{:name-r "localeToCharset", :doc "", :argslists ({:locale {}})}
 (r-interop.core/->clj-pos-kw-fn "localeToCharset"))

(def ls-str
 ^{:name-r "ls.str",
  :doc "",
  :argslists
  ({:pos {},
    :name nil,
    :envir nil,
    :all.names false,
    :pattern nil,
    :mode "any"})}
 (r-interop.core/->clj-pos-kw-fn "ls.str"))

(def lsf-str
 ^{:name-r "lsf.str",
  :doc "",
  :argslists ({:pos {}, :envir nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "lsf.str"))

(def maintainer
 ^{:name-r "maintainer", :doc "", :argslists ({:pkg nil})}
 (r-interop.core/->clj-pos-kw-fn "maintainer"))

(def make-packages-html
 ^{:name-r "make.packages.html",
  :doc "",
  :argslists ({:lib.loc {}, :temp false, :verbose true, :docdir {}})}
 (r-interop.core/->clj-pos-kw-fn "make.packages.html"))

(def make-socket
 ^{:name-r "make.socket",
  :doc "",
  :argslists
  ({:host "localhost", :port nil, :fail true, :server false})}
 (r-interop.core/->clj-pos-kw-fn "make.socket"))

(def make-rweave-latex-code-runner
 ^{:name-r "makeRweaveLatexCodeRunner",
  :doc "",
  :argslists ({:evalFunc nil})}
 (r-interop.core/->clj-pos-kw-fn "makeRweaveLatexCodeRunner"))

(def memory-limit
 ^{:name-r "memory.limit", :doc "", :argslists ({:size [nil]})}
 (r-interop.core/->clj-pos-kw-fn "memory.limit"))

(def memory-size
 ^{:name-r "memory.size", :doc "", :argslists ({:max false})}
 (r-interop.core/->clj-pos-kw-fn "memory.size"))

(def menu
 ^{:name-r "menu",
  :doc "",
  :argslists ({:choices nil, :graphics false, :title nil})}
 (r-interop.core/->clj-pos-kw-fn "menu"))

(def methods
 ^{:name-r "methods",
  :doc "",
  :argslists ({:generic.function nil, :class nil})}
 (r-interop.core/->clj-pos-kw-fn "methods"))

(def modify-list
 ^{:name-r "modifyList",
  :doc "",
  :argslists ({:x nil, :val nil, :keep.null false})}
 (r-interop.core/->clj-pos-kw-fn "modifyList"))

(def new-packages
 ^{:name-r "new.packages",
  :doc "",
  :argslists
  ({:lib.loc nil,
    :method nil,
    :type {},
    :repos {},
    :contriburl {},
    :... nil,
    :instPkgs {:empty-key nil, :lib.loc nil},
    :available nil,
    :ask false})}
 (r-interop.core/->clj-pos-kw-fn "new.packages"))

(def news
 ^{:name-r "news",
  :doc "",
  :argslists
  ({:query nil,
    :package "R",
    :lib.loc nil,
    :format nil,
    :reader nil,
    :db nil})}
 (r-interop.core/->clj-pos-kw-fn "news"))

(def nsl
 ^{:name-r "nsl", :doc "", :argslists ({:hostname nil})}
 (r-interop.core/->clj-pos-kw-fn "nsl"))

(def object-size
 ^{:name-r "object.size", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "object.size"))

(def old-packages
 ^{:name-r "old.packages",
  :doc "",
  :argslists
  ({:lib.loc nil,
    :method nil,
    :type {},
    :repos {},
    :contriburl {},
    :... nil,
    :checkBuilt false,
    :instPkgs {:empty-key nil, :lib.loc nil},
    :available nil})}
 (r-interop.core/->clj-pos-kw-fn "old.packages"))

(def package-skeleton
 ^{:name-r "package.skeleton",
  :doc "",
  :argslists
  ({:name "anRpackage",
    :list {},
    :environment nil,
    :path ".",
    :force false,
    :code_files {},
    :encoding "unknown"})}
 (r-interop.core/->clj-pos-kw-fn "package.skeleton"))

(def package-date
 ^{:name-r "packageDate",
  :doc "",
  :argslists
  ({:pkg nil,
    :lib.loc nil,
    :date.fields {},
    :tryFormats {},
    :desc {:empty-key nil, :lib.loc nil, :fields nil}})}
 (r-interop.core/->clj-pos-kw-fn "packageDate"))

(def package-description
 ^{:name-r "packageDescription",
  :doc "",
  :argslists
  ({:pkg nil, :lib.loc nil, :fields nil, :drop true, :encoding ""})}
 (r-interop.core/->clj-pos-kw-fn "packageDescription"))

(def package-name
 ^{:name-r "packageName", :doc "", :argslists ({:env {}})}
 (r-interop.core/->clj-pos-kw-fn "packageName"))

(def package-status
 ^{:name-r "packageStatus",
  :doc "",
  :argslists
  ({:lib.loc nil, :repositories nil, :method nil, :type {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "packageStatus"))

(def package-version
 ^{:name-r "packageVersion",
  :doc "",
  :argslists ({:pkg nil, :lib.loc nil})}
 (r-interop.core/->clj-pos-kw-fn "packageVersion"))

(def page
 ^{:name-r "page", :doc "", :argslists ({:x nil, :method {}, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "page"))

(def person
 ^{:name-r "person",
  :doc "",
  :argslists
  ({:given nil,
    :family nil,
    :middle nil,
    :email nil,
    :role nil,
    :comment nil,
    :first nil,
    :last nil})}
 (r-interop.core/->clj-pos-kw-fn "person"))

(def person-list
 ^{:name-r "personList", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "personList"))

(def pico
 ^{:name-r "pico", :doc "", :argslists ({:name nil, :file ""})}
 (r-interop.core/->clj-pos-kw-fn "pico"))

(def process-events
 ^{:name-r "process.events", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "process.events"))

(def prompt
 ^{:name-r "prompt",
  :doc "",
  :argslists ({:object nil, :filename nil, :name nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "prompt"))

(def prompt-data
 ^{:name-r "promptData",
  :doc "",
  :argslists ({:object nil, :filename nil, :name nil})}
 (r-interop.core/->clj-pos-kw-fn "promptData"))

(def prompt-import
 ^{:name-r "promptImport",
  :doc "",
  :argslists
  ({:object nil,
    :filename nil,
    :name nil,
    :importedFrom nil,
    :importPage nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "promptImport"))

(def prompt-package
 ^{:name-r "promptPackage",
  :doc "",
  :argslists
  ({:package nil,
    :lib.loc nil,
    :filename nil,
    :name nil,
    :final false})}
 (r-interop.core/->clj-pos-kw-fn "promptPackage"))

(def rc-get-option
 ^{:name-r "rc.getOption", :doc "", :argslists ({:name nil})}
 (r-interop.core/->clj-pos-kw-fn "rc.getOption"))

(def rc-options
 ^{:name-r "rc.options", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "rc.options"))

(def rc-settings
 ^{:name-r "rc.settings",
  :doc "",
  :argslists
  ({:args nil,
    :fuzzy nil,
    :func nil,
    :ns nil,
    :ops nil,
    :quotes nil,
    :files nil,
    :ipck nil,
    :argdb nil,
    :S3 nil,
    :help nil,
    :data nil})}
 (r-interop.core/->clj-pos-kw-fn "rc.settings"))

(def rc-status
 ^{:name-r "rc.status", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "rc.status"))

(def read-csv
 ^{:name-r "read.csv",
  :doc "",
  :argslists
  ({:file nil,
    :header true,
    :sep ",",
    :quote "\"",
    :dec ".",
    :fill true,
    :comment.char "",
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "read.csv"))

(def read-csv-2
 ^{:name-r "read.csv2",
  :doc "",
  :argslists
  ({:file nil,
    :header true,
    :sep ";",
    :quote "\"",
    :dec ",",
    :fill true,
    :comment.char "",
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "read.csv2"))

(def read-delim
 ^{:name-r "read.delim",
  :doc "",
  :argslists
  ({:file nil,
    :header true,
    :sep "\t",
    :quote "\"",
    :dec ".",
    :fill true,
    :comment.char "",
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "read.delim"))

(def read-delim-2
 ^{:name-r "read.delim2",
  :doc "",
  :argslists
  ({:file nil,
    :header true,
    :sep "\t",
    :quote "\"",
    :dec ",",
    :fill true,
    :comment.char "",
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "read.delim2"))

(def read-dif
 ^{:name-r "read.DIF",
  :doc "",
  :argslists
  ({:na.strings "NA",
    :blank.lines.skip true,
    :stringsAsFactors {},
    :transpose false,
    :file nil,
    :nrows {},
    :row.names nil,
    :fileEncoding "",
    :header false,
    :col.names nil,
    :check.names true,
    :numerals {},
    :as.is {},
    :dec ".",
    :colClasses [nil],
    :skip 0})}
 (r-interop.core/->clj-pos-kw-fn "read.DIF"))

(def read-fortran
 ^{:name-r "read.fortran",
  :doc "",
  :argslists
  ({:file nil, :format nil, :... nil, :as.is true, :colClasses [nil]})}
 (r-interop.core/->clj-pos-kw-fn "read.fortran"))

(def read-fwf
 ^{:name-r "read.fwf",
  :doc "",
  :argslists
  ({:sep "\t",
    :n {},
    :file nil,
    :row.names nil,
    :fileEncoding "",
    :header false,
    :widths nil,
    :col.names nil,
    :... nil,
    :buffersize 2000,
    :skip 0})}
 (r-interop.core/->clj-pos-kw-fn "read.fwf"))

(def read-socket
 ^{:name-r "read.socket",
  :doc "",
  :argslists ({:socket nil, :maxlen 256, :loop false})}
 (r-interop.core/->clj-pos-kw-fn "read.socket"))

(def read-table
 ^{:name-r "read.table",
  :doc "",
  :argslists
  ({:encoding "unknown",
    :flush false,
    :na.strings "NA",
    :sep "",
    :blank.lines.skip true,
    :allowEscapes false,
    :stringsAsFactors {},
    :fill {},
    :file nil,
    :nrows {},
    :row.names nil,
    :fileEncoding "",
    :header false,
    :col.names nil,
    :check.names true,
    :comment.char "#",
    :skipNul false,
    :numerals {},
    :quote "\"'",
    :as.is {},
    :dec ".",
    :strip.white false,
    :colClasses [nil],
    :skip 0,
    :text nil})}
 (r-interop.core/->clj-pos-kw-fn "read.table"))

(def read-citation-file
 ^{:name-r "readCitationFile",
  :doc "",
  :argslists ({:file nil, :meta nil})}
 (r-interop.core/->clj-pos-kw-fn "readCitationFile"))

(def recover
 ^{:name-r "recover", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "recover"))

(def relist
 ^{:name-r "relist", :doc "", :argslists ({:flesh nil, :skeleton {}})}
 (r-interop.core/->clj-pos-kw-fn "relist"))

(def remove-packages
 ^{:name-r "remove.packages",
  :doc "",
  :argslists ({:pkgs nil, :lib nil})}
 (r-interop.core/->clj-pos-kw-fn "remove.packages"))

(def remove-source
 ^{:name-r "removeSource", :doc "", :argslists ({:fn nil})}
 (r-interop.core/->clj-pos-kw-fn "removeSource"))

(def rprof
 ^{:name-r "Rprof",
  :doc "",
  :argslists
  ({:filename "Rprof.out",
    :append false,
    :interval 0.02,
    :memory.profiling false,
    :gc.profiling false,
    :line.profiling false,
    :numfiles 100,
    :bufsize 10000})}
 (r-interop.core/->clj-pos-kw-fn "Rprof"))

(def rprofmem
 ^{:name-r "Rprofmem",
  :doc "",
  :argslists ({:filename "Rprofmem.out", :append false, :threshold 0})}
 (r-interop.core/->clj-pos-kw-fn "Rprofmem"))

(def r-show-doc
 ^{:name-r "RShowDoc",
  :doc "",
  :argslists ({:what nil, :type {}, :package nil})}
 (r-interop.core/->clj-pos-kw-fn "RShowDoc"))

(def r-site-search
 ^{:name-r "RSiteSearch",
  :doc "",
  :argslists
  ({:string nil,
    :restrict {},
    :format {},
    :sortby {},
    :matchesPerPage 20})}
 (r-interop.core/->clj-pos-kw-fn "RSiteSearch"))

(def rtags
 ^{:name-r "rtags",
  :doc "",
  :argslists
  ({:path ".",
    :pattern "\\.[RrSs]$",
    :recursive false,
    :src
    {:empty-key nil,
     :path nil,
     :pattern nil,
     :full.names true,
     :recursive nil},
    :keep.re nil,
    :ofile "",
    :append false,
    :verbose {}})}
 (r-interop.core/->clj-pos-kw-fn "rtags"))

(def rtangle
 ^{:name-r "Rtangle", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "Rtangle"))

(def rtangle-setup
 ^{:name-r "RtangleSetup",
  :doc "",
  :argslists
  ({:file nil,
    :syntax nil,
    :output nil,
    :annotate true,
    :split false,
    :quiet false,
    :drop.evalFALSE false,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "RtangleSetup"))

(def rtangle-writedoc
 ^{:name-r "RtangleWritedoc",
  :doc "",
  :argslists ({:object nil, :chunk nil})}
 (r-interop.core/->clj-pos-kw-fn "RtangleWritedoc"))

(def rweave-chunk-prefix
 ^{:name-r "RweaveChunkPrefix", :doc "", :argslists ({:options nil})}
 (r-interop.core/->clj-pos-kw-fn "RweaveChunkPrefix"))

(def rweave-eval-with-opt
 ^{:name-r "RweaveEvalWithOpt",
  :doc "",
  :argslists ({:expr nil, :options nil})}
 (r-interop.core/->clj-pos-kw-fn "RweaveEvalWithOpt"))

(def rweave-latex
 ^{:name-r "RweaveLatex", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "RweaveLatex"))

(def rweave-latex-finish
 ^{:name-r "RweaveLatexFinish",
  :doc "",
  :argslists ({:object nil, :error false})}
 (r-interop.core/->clj-pos-kw-fn "RweaveLatexFinish"))

(def rweave-latex-options
 ^{:name-r "RweaveLatexOptions", :doc "", :argslists ({:options nil})}
 (r-interop.core/->clj-pos-kw-fn "RweaveLatexOptions"))

(def rweave-latex-setup
 ^{:name-r "RweaveLatexSetup",
  :doc "",
  :argslists
  ({:file nil,
    :syntax nil,
    :output nil,
    :quiet false,
    :debug false,
    :stylepath nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "RweaveLatexSetup"))

(def rweave-latex-writedoc
 ^{:name-r "RweaveLatexWritedoc",
  :doc "",
  :argslists ({:object nil, :chunk nil})}
 (r-interop.core/->clj-pos-kw-fn "RweaveLatexWritedoc"))

(def rweave-try-stop
 ^{:name-r "RweaveTryStop",
  :doc "",
  :argslists ({:err nil, :options nil})}
 (r-interop.core/->clj-pos-kw-fn "RweaveTryStop"))

(def savehistory
 ^{:name-r "savehistory", :doc "", :argslists ({:file ".Rhistory"})}
 (r-interop.core/->clj-pos-kw-fn "savehistory"))

(def select-list
 ^{:name-r "select.list",
  :doc "",
  :argslists
  ({:choices nil,
    :preselect nil,
    :multiple false,
    :title nil,
    :graphics {}})}
 (r-interop.core/->clj-pos-kw-fn "select.list"))

(def session-info
 ^{:name-r "sessionInfo", :doc "", :argslists ({:package nil})}
 (r-interop.core/->clj-pos-kw-fn "sessionInfo"))

(def set-breakpoint
 ^{:name-r "setBreakpoint",
  :doc "",
  :argslists
  ({:envir {},
    :nameonly true,
    :lastenv nil,
    :tracer nil,
    :verbose true,
    :print false,
    :srcfile nil,
    :line nil,
    :... nil,
    :clear false})}
 (r-interop.core/->clj-pos-kw-fn "setBreakpoint"))

(def set-repositories
 ^{:name-r "setRepositories",
  :doc "",
  :argslists ({:graphics {}, :ind nil, :addURLs {}})}
 (r-interop.core/->clj-pos-kw-fn "setRepositories"))

(def set-txt-progress-bar
 ^{:name-r "setTxtProgressBar",
  :doc "",
  :argslists ({:pb nil, :value nil, :title nil, :label nil})}
 (r-interop.core/->clj-pos-kw-fn "setTxtProgressBar"))

(def stack
 ^{:name-r "stack", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "stack"))

(def stangle
 ^{:name-r "Stangle",
  :doc "",
  :argslists
  ({:file nil, :driver {}, :syntax {}, :encoding "", :... nil})}
 (r-interop.core/->clj-pos-kw-fn "Stangle"))

(def str
 ^{:name-r "str", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "str"))

(def strcapture
 ^{:name-r "strcapture",
  :doc "",
  :argslists
  ({:pattern nil, :x nil, :proto nil, :perl false, :useBytes false})}
 (r-interop.core/->clj-pos-kw-fn "strcapture"))

(def str-options
 ^{:name-r "strOptions",
  :doc "",
  :argslists
  ({:strict.width "no",
    :digits.d 3,
    :vec.len 4,
    :drop.deparse.attr true,
    :formatNum {}})}
 (r-interop.core/->clj-pos-kw-fn "strOptions"))

(def summary-rprof
 ^{:name-r "summaryRprof",
  :doc "",
  :argslists
  ({:filename "Rprof.out",
    :chunksize 5000,
    :memory {},
    :lines {},
    :index 2,
    :diff true,
    :exclude nil,
    :basenames 1})}
 (r-interop.core/->clj-pos-kw-fn "summaryRprof"))

(def suppress-foreign-check
 ^{:name-r "suppressForeignCheck",
  :doc "",
  :argslists ({:names nil, :package nil, :add true})}
 (r-interop.core/->clj-pos-kw-fn "suppressForeignCheck"))

(def sweave
 ^{:name-r "Sweave",
  :doc "",
  :argslists
  ({:file nil, :driver {}, :syntax {}, :encoding "", :... nil})}
 (r-interop.core/->clj-pos-kw-fn "Sweave"))

(def sweave-hooks
 ^{:name-r "SweaveHooks",
  :doc "",
  :argslists ({:options nil, :run false, :envir nil})}
 (r-interop.core/->clj-pos-kw-fn "SweaveHooks"))

(def sweave-synt-conv
 ^{:name-r "SweaveSyntConv",
  :doc "",
  :argslists ({:file nil, :syntax nil, :output nil})}
 (r-interop.core/->clj-pos-kw-fn "SweaveSyntConv"))

(def tail
 ^{:name-r "tail", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "tail"))

(def tail-matrix
 ^{:name-r "tail.matrix",
  :doc "",
  :argslists ({:x nil, :n 6, :addrownums true, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "tail.matrix"))

(def tar
 ^{:name-r "tar",
  :doc "",
  :argslists
  ({:tarfile nil,
    :files nil,
    :compression {},
    :compression_level 6,
    :tar {},
    :extra_flags ""})}
 (r-interop.core/->clj-pos-kw-fn "tar"))

(def timestamp
 ^{:name-r "timestamp",
  :doc "",
  :argslists
  ({:stamp {},
    :prefix "##------ ",
    :suffix " ------##",
    :quiet false})}
 (r-interop.core/->clj-pos-kw-fn "timestamp"))

(def to-bibtex
 ^{:name-r "toBibtex", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "toBibtex"))

(def to-latex
 ^{:name-r "toLatex", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "toLatex"))

(def txt-progress-bar
 ^{:name-r "txtProgressBar",
  :doc "",
  :argslists
  ({:min 0,
    :file "",
    :width [nil],
    :title nil,
    :style 1,
    :max 1,
    :label nil,
    :initial 0,
    :char "="})}
 (r-interop.core/->clj-pos-kw-fn "txtProgressBar"))

(def type-convert
 ^{:name-r "type.convert", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "type.convert"))

(def undebugcall
 ^{:name-r "undebugcall", :doc "", :argslists ({:call nil})}
 (r-interop.core/->clj-pos-kw-fn "undebugcall"))

(def unstack
 ^{:name-r "unstack", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "unstack"))

(def untar
 ^{:name-r "untar",
  :doc "",
  :argslists
  ({:exdir ".",
    :restore_times true,
    :tar {},
    :verbose false,
    :tarfile nil,
    :compressed [nil],
    :list false,
    :files nil,
    :extras nil})}
 (r-interop.core/->clj-pos-kw-fn "untar"))

(def unzip
 ^{:name-r "unzip",
  :doc "",
  :argslists
  ({:zipfile nil,
    :files nil,
    :list false,
    :overwrite true,
    :junkpaths false,
    :exdir ".",
    :unzip "internal",
    :setTimes false})}
 (r-interop.core/->clj-pos-kw-fn "unzip"))

(def update-packages
 ^{:name-r "update.packages",
  :doc "",
  :argslists
  ({:lib.loc nil,
    :method nil,
    :type {},
    :repos {},
    :contriburl {},
    :... nil,
    :checkBuilt false,
    :oldPkgs nil,
    :available nil,
    :instlib nil,
    :ask true})}
 (r-interop.core/->clj-pos-kw-fn "update.packages"))

(def upgrade
 ^{:name-r "upgrade", :doc "", :argslists ({:object nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "upgrade"))

(def url-show
 ^{:name-r "url.show",
  :doc "",
  :argslists
  ({:url nil,
    :title nil,
    :file {},
    :delete.file true,
    :method nil,
    :... nil})}
 (r-interop.core/->clj-pos-kw-fn "url.show"))

(def ur-ldecode
 ^{:name-r "URLdecode", :doc "", :argslists ({:URL nil})}
 (r-interop.core/->clj-pos-kw-fn "URLdecode"))

(def ur-lencode
 ^{:name-r "URLencode",
  :doc "",
  :argslists ({:URL nil, :reserved false, :repeated false})}
 (r-interop.core/->clj-pos-kw-fn "URLencode"))

(def vi
 ^{:name-r "vi", :doc "", :argslists ({:name nil, :file ""})}
 (r-interop.core/->clj-pos-kw-fn "vi"))

(def view
 ^{:name-r "View", :doc "", :argslists ({:x nil, :title nil})}
 (r-interop.core/->clj-pos-kw-fn "View"))

(def vignette
 ^{:name-r "vignette",
  :doc "",
  :argslists ({:topic nil, :package nil, :lib.loc nil, :all true})}
 (r-interop.core/->clj-pos-kw-fn "vignette"))

(def warn-err-list
 ^{:name-r "warnErrList",
  :doc "",
  :argslists ({:x nil, :warn true, :errValue nil})}
 (r-interop.core/->clj-pos-kw-fn "warnErrList"))

(def write-csv
 ^{:name-r "write.csv", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "write.csv"))

(def write-csv-2
 ^{:name-r "write.csv2", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "write.csv2"))

(def write-socket
 ^{:name-r "write.socket",
  :doc "",
  :argslists ({:socket nil, :string nil})}
 (r-interop.core/->clj-pos-kw-fn "write.socket"))

(def write-table
 ^{:name-r "write.table",
  :doc "",
  :argslists
  ({:sep " ",
    :qmethod {},
    :file "",
    :append false,
    :row.names true,
    :fileEncoding "",
    :col.names true,
    :quote true,
    :na "NA",
    :eol "\n",
    :x nil,
    :dec "."})}
 (r-interop.core/->clj-pos-kw-fn "write.table"))

(def xedit
 ^{:name-r "xedit", :doc "", :argslists ({:name nil, :file ""})}
 (r-interop.core/->clj-pos-kw-fn "xedit"))

(def xemacs
 ^{:name-r "xemacs", :doc "", :argslists ({:name nil, :file ""})}
 (r-interop.core/->clj-pos-kw-fn "xemacs"))

(def zip
 ^{:name-r "zip",
  :doc "",
  :argslists
  ({:zipfile nil, :files nil, :flags "-r9X", :extras "", :zip {}})}
 (r-interop.core/->clj-pos-kw-fn "zip"))
