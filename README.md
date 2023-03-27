XML Hiccup
==========
[![xml-hiccup](https://img.shields.io/clojars/v/dk.cst/xml-hiccup.svg)](https://clojars.org/dk.cst/xml-hiccup)

Clojure(Script) implementation of an XML parser that, more or less directly,
converts an XML file into Hiccup data without trying to be clever about it.

Comments and superfluous whitespace are deliberately not preserved, while
namespaces are converted into regular Clojure namespaces. No attempt is made
to map namespace URIs to namespace aliases.

Usage
-----
This example shows how to parse a `File`, though it could also be a `String` or an `InputStream`. 

```clojure
(require '[dk.cst.xml-hiccup :as xh]
         '[clojure.java.io :as io])

(xh/parse (io/file "test/test-1307-anno-tei.xml"))
```

> NOTE: ClojureScript _only_ supports parsing XML strings!

Why even use this?
------------------
For various reasons, I needed a library that can turn XML into _identical_ Hiccup in *both* my backend code _and_ my frontend code. This library does that.
