# Stopwatch

A small, simple, composable library for timing expression evaluation.

```clj
(nano (reduce + (range 1e6)))
=> 77472186

(nanov (reduce + (range 1e6)))
=> [151531007 499999500000]

(nanof
  #(println (str "Elapsed time: " (* % 1.0e-6) " msecs"))
  (reduce + (range 1e6)))
Elapsed time: 201.576098 msecs
=> 499999500000
```

## Rationale 

While handy, clojure.core/time does not support programmatic access to timing data.  Instead, Stopwatch's macros provide access to the timing value, either as the returned value or via a handler function.  The latter case supports instrumenting code for collecting timing data without changing code execution.

## Installation
Leiningen:
```clj
[stopwatch "0.1.0"]
```


## License

Copyright © 2015 Jonathan Newton

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
