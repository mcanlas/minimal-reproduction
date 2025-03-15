lazy val root =
  (project in file("."))
    .settings(libraryDependencies += "org.scalameta" %% "scalameta" % "4.13.3" cross CrossVersion.for3Use2_13)
