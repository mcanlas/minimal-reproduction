```bash
sbt "++ 2.13.8 run" "++ 3.1.1 run"
```

Scala 2.13.8 allows `F[Int]` and `F[Unit]` to LUB up to `F[AnyVal]`

Scala 3 returns `F[Int] | F[Unit]` instead, which prevents the use of the `map` syntax from `cats`.
