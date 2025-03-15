```bash
sbt "+works-in-scala-3/run" "+breaks-in-scala-3/run"
```

Scala 2.13.16 allows `F[Int]` and `F[Unit]` to LUB up to `F[AnyVal]`

Scala 3 returns `F[Int] | F[Unit]` instead, which prevents the use of the `map` syntax from `cats`.
