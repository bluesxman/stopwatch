(ns stopwatch.core)

(defmacro nano
  "Returns the time to evaluate the expression in nanoseconds."
  [expr]
  `(let [start# (System/nanoTime)]
     ~expr
     (- (System/nanoTime) start#)))

(defmacro nanof
  "Returns the result of the expression and also calls the function f on the
  time (in nanoseconds) it took to evaluate the expression."
  [f expr]
  `(let [start# (System/nanoTime)
         ret# ~expr]
     (~f (- (System/nanoTime) start#))
     ret#))

(defmacro nanov
  "Returns a vector where the first value is the time in nanoseconds to evaluate the
  expression and the second value is the result of evaluating the expression."
  [expr]
  `(let [start# (System/nanoTime)
         ret# ~expr]
     [(- (System/nanoTime) start#) ret#]))