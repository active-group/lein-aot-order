# lein-aot-order

This leiningen plugin provides commands to work around problems of
clojure ahead-of-time compilation, by determining a suitable
compilation order via clojure.tools.namespace.

## Usage

Put `[lein-aot-order "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

The following tasks are provided:
  lein aot-order     which just prints the determines order,
  lein aot-jar       which invokes the jar tasks, with a suitable :aot setting.

    $ lein aot-order

## License

Copyright © 2017 Active Group GmbH

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
