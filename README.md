# lein-aot-order

This leiningen plugin provides commands to work around problems of
clojure ahead-of-time compilation, by determining a suitable
compilation order via clojure.tools.namespace.

This requires Leiningen 2.6.1 or higher.

## Usage

Put [![Clojars Project](https://img.shields.io/clojars/v/lein-aot-order.svg)](https://clojars.org/lein-aot-order) into the `:plugins` vector of your project.clj.

Then you can start the following tasks:
  lein aot-order     which just prints the determines order

And if you set the :aot in your project:

  :aot  :order

the setting is automatically replaced by the determined order of your
namespaces.  That is order will then be used by the `jar` or `uberjar`
tasks, just as if you specified it manually.

## License

Copyright © 2017 Active Group GmbH

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
