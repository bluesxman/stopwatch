# Stopwatch

A small, simple, composable library for timing expression evaluation.

```clj
(require '[stopwatch.core :refer :all])
=> nil
(nano (reduce + (range 1e6)))
=> 258354609
(nanov (reduce + (range 1e6)))
=> [155710388 499999500000]
(nanof
  #(println (str "Elapsed time: " (* % 1.0e-6) " msecs"))
  (reduce + (range 1e6)))
Elapsed time: 108.016106 msecs
=> 499999500000
```

## Rationale 

While handy, clojure.core/time does not support programmatic access to timing data.  Instead, Stopwatch's macros provide access to the timing value, either as the returned value or via a handler function.  The latter case supports instrumenting code for collecting timing data without changing code execution.

## Installation

Leiningen

[![Clojars Project](http://clojars.org/stopwatch/latest-version.svg)](http://clojars.org/stopwatch)

Gradle
```groovy
compile "stopwatch:stopwatch:0.1.0"
```

Maven
```xml
<dependency>
  <groupId>stopwatch</groupId>
  <artifactId>stopwatch</artifactId>
  <version>0.1.0</version>
</dependency>
```

## License

Copyright © 2015 Jonathan Newton

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
