```bash
sbt "++ 2.13.8 breaks-in-scala-3/run" "++ 3.1.1 breaks-in-scala-3/run"
sbt "++ 3.1.1 works-in-scala-3/run"
```

Scala 2.13.8 allows `F[Int]` and `F[Unit]` to LUB up to `F[AnyVal]`

Scala 3 returns `F[Int] | F[Unit]` instead, which prevents the use of the `map` syntax from `cats`.
