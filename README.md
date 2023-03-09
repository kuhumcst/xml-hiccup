XML Hiccup
==========
[![xml-hiccup](https://img.shields.io/clojars/v/dk.cst/xml-hiccup.svg)](https://clojars.org/dk.cst/xml-hiccup)

Clojure(Script) implementation of an XML parser that, more or less directly,
converts an XML file into Hiccup data without trying to be clever about it.

Comments and superfluous whitespace are deliberately not preserved, while
namespaces are converted into regular Clojure namespaces. No attempt is made
to map namespace URIs to namespace aliases.

Why even use this?
------------------
For various reasons, I needed a library that can turn XML into Hiccup in both my backend code and my frontend code. This library does that.
