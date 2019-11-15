(ns r-interop.packages.gr-devices
 (:require [r-interop.core :refer (defn-r)]))

(defn-r dev-copy->eps dev.copy2eps)
(defn-r dev-copy->pdf dev.copy2pdf)
(defn-r dev->bitmap dev2bitmap)
(defn-r rgb->hsv rgb2hsv)

(def adjustcolor
 ^{:name-r "adjustcolor",
  :doc "",
  :argslists
  ({:col nil,
    :alpha.f 1,
    :red.f 1,
    :green.f 1,
    :blue.f 1,
    :offset [nil 0 0 0 0],
    :transform [nil [nil nil nil nil nil]]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::adjustcolor"))

(def as-graphics-annot
 ^{:name-r "as.graphicsAnnot", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::as.graphicsAnnot"))

(def as-raster
 ^{:name-r "as.raster", :doc "", :argslists ({:x nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::as.raster"))

(def awt
 ^{:name-r "awt",
  :doc "",
  :argslists ({:width nil, :height nil, :graphicsObj nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::awt"))

(def axis-ticks
 ^{:name-r "axisTicks",
  :doc "",
  :argslists ({:usr nil, :log nil, :axp nil, :nint 5})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::axisTicks"))

(def bitmap
 ^{:name-r "bitmap",
  :doc "",
  :argslists
  ({:pointsize nil,
    :gaa [nil],
    :file nil,
    :width 7,
    :type "png16m",
    :taa [nil],
    :... nil,
    :units "in",
    :res 72,
    :height 7})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::bitmap"))

(def bmp
 ^{:name-r "bmp",
  :doc "",
  :argslists
  ({:pointsize 12,
    :antialias nil,
    :width 480,
    :type [nil "cairo" "Xlib" "quartz"],
    :filename "Rplot%03d.bmp",
    :... nil,
    :units "px",
    :res [nil],
    :bg "white",
    :height 480})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::bmp"))

(def boxplot-stats
 ^{:name-r "boxplot.stats",
  :doc "",
  :argslists ({:x nil, :coef 1.5, :do.conf true, :do.out true})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::boxplot.stats"))

(def cairo-pdf
 ^{:name-r "cairo_pdf",
  :doc "",
  :argslists
  ({:pointsize 12,
    :family "sans",
    :antialias [nil "default" "none" "gray" "subpixel"],
    :width 7,
    :onefile false,
    :filename [nil nil "Rplots.pdf" "Rplot%03d.pdf"],
    :bg "white",
    :height 7,
    :fallback_resolution 300})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::cairo_pdf"))

(def cairo-ps
 ^{:name-r "cairo_ps",
  :doc "",
  :argslists
  ({:pointsize 12,
    :family "sans",
    :antialias [nil "default" "none" "gray" "subpixel"],
    :width 7,
    :onefile false,
    :filename [nil nil "Rplots.ps" "Rplot%03d.ps"],
    :bg "white",
    :height 7,
    :fallback_resolution 300})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::cairo_ps"))

(def check-options
 ^{:name-r "check.options",
  :doc "",
  :argslists
  ({:new nil,
    :name.opt nil,
    :reset false,
    :assign.opt false,
    :envir nil,
    :check.attributes [nil "mode" "length"],
    :override.check false})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::check.options"))

(def chull
 ^{:name-r "chull", :doc "", :argslists ({:x nil, :y nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::chull"))

(def cid-font
 ^{:name-r "CIDFont",
  :doc "",
  :argslists
  ({:family nil, :cmap nil, :cmapEncoding nil, :pdfresource ""})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::CIDFont"))

(def cm
 ^{:name-r "cm", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::cm"))

(def cm-colors
 ^{:name-r "cm.colors", :doc "", :argslists ({:n nil, :alpha 1})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::cm.colors"))

(def col-2rgb
 ^{:name-r "col2rgb", :doc "", :argslists ({:col nil, :alpha false})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::col2rgb"))

(def color-converter
 ^{:name-r "colorConverter",
  :doc "",
  :argslists ({:toXYZ nil, :fromXYZ nil, :name nil, :white nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::colorConverter"))

(def color-ramp
 ^{:name-r "colorRamp",
  :doc "",
  :argslists
  ({:colors nil,
    :bias 1,
    :space [nil "rgb" "Lab"],
    :interpolate [nil "linear" "spline"],
    :alpha false})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::colorRamp"))

(def color-ramp-palette
 ^{:name-r "colorRampPalette",
  :doc "",
  :argslists ({:colors nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::colorRampPalette"))

(def colors
 ^{:name-r "colors", :doc "", :argslists ({:distinct false})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::colors"))

(def colours
 ^{:name-r "colours", :doc "", :argslists ({:distinct false})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::colours"))

(def contour-lines
 ^{:name-r "contourLines",
  :doc "",
  :argslists
  ({:x {:empty-key nil, :length.out [nil nil]},
    :y {:empty-key nil, :length.out [nil nil]},
    :z nil,
    :nlevels 10,
    :levels [nil {:empty-key nil, :na.rm true} nil]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::contourLines"))

(def convert-color
 ^{:name-r "convertColor",
  :doc "",
  :argslists
  ({:color nil,
    :from nil,
    :to nil,
    :from.ref.white nil,
    :to.ref.white nil,
    :scale.in 1,
    :scale.out 1,
    :clip true})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::convertColor"))

(def dens-cols
 ^{:name-r "densCols",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :nbin 128,
    :bandwidth nil,
    :colramp [nil [nil nil [nil [nil [nil 1 3]]]]]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::densCols"))

(def dev-capabilities
 ^{:name-r "dev.capabilities", :doc "", :argslists ({:what nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.capabilities"))

(def dev-capture
 ^{:name-r "dev.capture", :doc "", :argslists ({:native false})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.capture"))

(def dev-control
 ^{:name-r "dev.control",
  :doc "",
  :argslists ({:displaylist [nil "inhibit" "enable"]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.control"))

(def dev-copy
 ^{:name-r "dev.copy",
  :doc "",
  :argslists ({:device nil, :... nil, :which [nil]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.copy"))

(def dev-cur
 ^{:name-r "dev.cur", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.cur"))

(def dev-flush
 ^{:name-r "dev.flush", :doc "", :argslists ({:level 1})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.flush"))

(def dev-hold
 ^{:name-r "dev.hold", :doc "", :argslists ({:level 1})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.hold"))

(def dev-interactive
 ^{:name-r "dev.interactive", :doc "", :argslists ({:orNone false})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.interactive"))

(def dev-list
 ^{:name-r "dev.list", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.list"))

(def dev-new
 ^{:name-r "dev.new",
  :doc "",
  :argslists ({:... nil, :noRStudioGD false})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.new"))

(def dev-next
 ^{:name-r "dev.next", :doc "", :argslists ({:which [nil]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.next"))

(def dev-off
 ^{:name-r "dev.off", :doc "", :argslists ({:which [nil]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.off"))

(def dev-prev
 ^{:name-r "dev.prev", :doc "", :argslists ({:which [nil]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.prev"))

(def dev-print
 ^{:name-r "dev.print", :doc "", :argslists ({:device nil, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.print"))

(def dev-set
 ^{:name-r "dev.set", :doc "", :argslists ({:which [nil]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.set"))

(def dev-size
 ^{:name-r "dev.size",
  :doc "",
  :argslists ({:units [nil "in" "cm" "px"]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::dev.size"))

(def dev-ask-new-page
 ^{:name-r "devAskNewPage", :doc "", :argslists ({:ask nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::devAskNewPage"))

(def device-is-interactive
 ^{:name-r "deviceIsInteractive", :doc "", :argslists ({:name nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::deviceIsInteractive"))

(def embed-fonts
 ^{:name-r "embedFonts",
  :doc "",
  :argslists
  ({:file nil,
    :format nil,
    :outfile nil,
    :fontpaths [nil],
    :options [nil]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::embedFonts"))

(def extendrange
 ^{:name-r "extendrange",
  :doc "",
  :argslists ({:x nil, :r {:empty-key nil, :na.rm true}, :f 0.05})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::extendrange"))

(def get-graphics-event
 ^{:name-r "getGraphicsEvent",
  :doc "",
  :argslists
  ({:prompt "Waiting for input",
    :onMouseDown nil,
    :onMouseMove nil,
    :onMouseUp nil,
    :onKeybd nil,
    :onIdle nil,
    :consolePrompt nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::getGraphicsEvent"))

(def get-graphics-event-env
 ^{:name-r "getGraphicsEventEnv", :doc "", :argslists ({:which [nil]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::getGraphicsEventEnv"))

(def graphics-off
 ^{:name-r "graphics.off", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "grDevices::graphics.off"))

(def gray
 ^{:name-r "gray", :doc "", :argslists ({:level nil, :alpha nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::gray"))

(def gray-colors
 ^{:name-r "gray.colors",
  :doc "",
  :argslists ({:n nil, :start 0.3, :end 0.9, :gamma 2.2, :alpha nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::gray.colors"))

(def grey
 ^{:name-r "grey", :doc "", :argslists ({:level nil, :alpha nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::grey"))

(def grey-colors
 ^{:name-r "grey.colors",
  :doc "",
  :argslists ({:n nil, :start 0.3, :end 0.9, :gamma 2.2, :alpha nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::grey.colors"))

(def gr-soft-version
 ^{:name-r "grSoftVersion", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "grDevices::grSoftVersion"))

(def hcl
 ^{:name-r "hcl",
  :doc "",
  :argslists ({:h 0, :c 35, :l 85, :alpha 1, :fixup true})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::hcl"))

(def heat-colors
 ^{:name-r "heat.colors", :doc "", :argslists ({:n nil, :alpha 1})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::heat.colors"))

(def hsv
 ^{:name-r "hsv", :doc "", :argslists ({:h 1, :s 1, :v 1, :alpha 1})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::hsv"))

(def is-raster
 ^{:name-r "is.raster", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::is.raster"))

(def jpeg
 ^{:name-r "jpeg",
  :doc "",
  :argslists
  ({:pointsize 12,
    :antialias nil,
    :width 480,
    :type [nil "cairo" "Xlib" "quartz"],
    :filename "Rplot%03d.jpeg",
    :... nil,
    :quality 75,
    :units "px",
    :res [nil],
    :bg "white",
    :height 480})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::jpeg"))

(def make-rgb
 ^{:name-r "make.rgb",
  :doc "",
  :argslists
  ({:red nil,
    :green nil,
    :blue nil,
    :name nil,
    :white "D65",
    :gamma 2.2})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::make.rgb"))

(def nclass-fd
 ^{:name-r "nclass.FD", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::nclass.FD"))

(def nclass-scott
 ^{:name-r "nclass.scott", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::nclass.scott"))

(def nclass-sturges
 ^{:name-r "nclass.Sturges", :doc "", :argslists ({:x nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::nclass.Sturges"))

(def palette
 ^{:name-r "palette", :doc "", :argslists ({:value nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::palette"))

(def pdf
 ^{:name-r "pdf",
  :doc "",
  :argslists
  ({:encoding nil,
    :pointsize nil,
    :family nil,
    :fg nil,
    :file [nil nil "Rplots.pdf" "Rplot%03d.pdf"],
    :paper nil,
    :width nil,
    :useDingbats nil,
    :onefile nil,
    :colormodel nil,
    :title nil,
    :compress nil,
    :pagecentre nil,
    :useKerning nil,
    :version nil,
    :bg nil,
    :height nil,
    :fillOddEven nil,
    :fonts nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::pdf"))

(def pdf-options
 ^{:name-r "pdf.options",
  :doc "",
  :argslists ({:... nil, :reset false})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::pdf.options"))

(def pdf-fonts
 ^{:name-r "pdfFonts", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::pdfFonts"))

(def pictex
 ^{:name-r "pictex",
  :doc "",
  :argslists
  ({:file "Rplots.tex",
    :width 5,
    :height 4,
    :debug false,
    :bg "white",
    :fg "black"})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::pictex"))

(def png
 ^{:name-r "png",
  :doc "",
  :argslists
  ({:pointsize 12,
    :antialias nil,
    :width 480,
    :type [nil "cairo" "cairo-png" "Xlib" "quartz"],
    :filename "Rplot%03d.png",
    :... nil,
    :units "px",
    :res [nil],
    :bg "white",
    :height 480})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::png"))

(def postscript
 ^{:name-r "postscript",
  :doc "",
  :argslists
  ({:encoding nil,
    :pointsize nil,
    :horizontal nil,
    :family nil,
    :fg nil,
    :file [nil nil "Rplots.ps" "Rplot%03d.ps"],
    :paper nil,
    :width nil,
    :onefile nil,
    :command nil,
    :colormodel nil,
    :title nil,
    :pagecentre nil,
    :useKerning nil,
    :print.it nil,
    :bg nil,
    :height nil,
    :fillOddEven nil,
    :fonts nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::postscript"))

(def postscript-fonts
 ^{:name-r "postscriptFonts", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::postscriptFonts"))

(def ps-options
 ^{:name-r "ps.options",
  :doc "",
  :argslists ({:... nil, :reset false, :override.check false})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::ps.options"))

(def quartz
 ^{:name-r "quartz",
  :doc "",
  :argslists
  ({:pointsize nil,
    :family nil,
    :antialias nil,
    :file nil,
    :width nil,
    :type nil,
    :canvas nil,
    :title nil,
    :dpi nil,
    :bg nil,
    :height nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::quartz"))

(def quartz-options
 ^{:name-r "quartz.options",
  :doc "",
  :argslists ({:... nil, :reset false})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::quartz.options"))

(def quartz-save
 ^{:name-r "quartz.save",
  :doc "",
  :argslists
  ({:file nil, :type "png", :device [nil], :dpi 100, :... nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::quartz.save"))

(def quartz-font
 ^{:name-r "quartzFont", :doc "", :argslists ({:family nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::quartzFont"))

(def quartz-fonts
 ^{:name-r "quartzFonts", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::quartzFonts"))

(def rainbow
 ^{:name-r "rainbow",
  :doc "",
  :argslists
  ({:n nil,
    :s 1,
    :v 1,
    :start 0,
    :end [nil [nil 1 [nil nil 1]] nil],
    :alpha 1})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::rainbow"))

(def record-graphics
 ^{:name-r "recordGraphics",
  :doc "",
  :argslists ({:expr nil, :list nil, :env nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::recordGraphics"))

(def record-plot
 ^{:name-r "recordPlot", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "grDevices::recordPlot"))

(def replay-plot
 ^{:name-r "replayPlot", :doc "", :argslists ({:dl nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::replayPlot"))

(def rgb
 ^{:name-r "rgb",
  :doc "",
  :argslists
  ({:red nil,
    :green nil,
    :blue nil,
    :alpha nil,
    :names nil,
    :maxColorValue 1})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::rgb"))

(def save-plot
 ^{:name-r "savePlot",
  :doc "",
  :argslists
  ({:filename {:empty-key nil, :sep "."},
    :type [nil "png" "jpeg" "bmp"],
    :device [nil]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::savePlot"))

(def set-eps
 ^{:name-r "setEPS", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::setEPS"))

(def set-graphics-event-env
 ^{:name-r "setGraphicsEventEnv",
  :doc "",
  :argslists ({:which [nil], :env nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::setGraphicsEventEnv"))

(def set-graphics-event-handlers
 ^{:name-r "setGraphicsEventHandlers",
  :doc "",
  :argslists ({:which [nil], :... nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::setGraphicsEventHandlers"))

(def set-ps
 ^{:name-r "setPS", :doc "", :argslists ({:... nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::setPS"))

(def svg
 ^{:name-r "svg",
  :doc "",
  :argslists
  ({:filename [nil nil "Rplots.svg" "Rplot%03d.svg"],
    :width 7,
    :height 7,
    :pointsize 12,
    :onefile false,
    :family "sans",
    :bg "white",
    :antialias [nil "default" "none" "gray" "subpixel"]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::svg"))

(def svg-off
 ^{:name-r "svg.off", :doc "", :argslists ({:which [nil]})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::svg.off"))

(def svg-string
 ^{:name-r "svg.string", :doc "", :argslists (nil)}
 (r-interop.core/->clj-pos-kw-fn "grDevices::svg.string"))

(def terrain-colors
 ^{:name-r "terrain.colors", :doc "", :argslists ({:n nil, :alpha 1})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::terrain.colors"))

(def tiff
 ^{:name-r "tiff",
  :doc "",
  :argslists
  ({:pointsize 12,
    :antialias nil,
    :width 480,
    :type [nil "cairo" "Xlib" "quartz"],
    :compression [nil "none" "rle" "lzw" "jpeg" "zip" "lzw+p" "zip+p"],
    :filename "Rplot%03d.tiff",
    :... nil,
    :units "px",
    :res [nil],
    :bg "white",
    :height 480})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::tiff"))

(def topo-colors
 ^{:name-r "topo.colors", :doc "", :argslists ({:n nil, :alpha 1})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::topo.colors"))

(def trans-3d
 ^{:name-r "trans3d",
  :doc "",
  :argslists ({:x nil, :y nil, :z nil, :pmat nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::trans3d"))

(def type-1-font
 ^{:name-r "Type1Font",
  :doc "",
  :argslists ({:family nil, :metrics nil, :encoding "default"})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::Type1Font"))

(def xfig
 ^{:name-r "xfig",
  :doc "",
  :argslists
  ({:encoding "none",
    :pointsize 12,
    :defaultfont false,
    :horizontal true,
    :family "Helvetica",
    :fg "black",
    :file [nil nil "Rplots.fig" "Rplot%03d.fig"],
    :paper "default",
    :width 0,
    :onefile false,
    :textspecial false,
    :pagecentre true,
    :bg "transparent",
    :height 0})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::xfig"))

(def xy-coords
 ^{:name-r "xy.coords",
  :doc "",
  :argslists
  ({:x nil,
    :y nil,
    :xlab nil,
    :ylab nil,
    :log nil,
    :recycle false,
    :setLab true})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::xy.coords"))

(def xy-table
 ^{:name-r "xyTable",
  :doc "",
  :argslists ({:x nil, :y nil, :digits nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::xyTable"))

(def xyz-coords
 ^{:name-r "xyz.coords",
  :doc "",
  :argslists
  ({:y nil,
    :zlab nil,
    :ylab nil,
    :recycle false,
    :setLab true,
    :z nil,
    :xlab nil,
    :x nil,
    :log nil})}
 (r-interop.core/->clj-pos-kw-fn "grDevices::xyz.coords"))
