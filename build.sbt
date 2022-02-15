lazy val `breaks-in-scala-3` =
  project
    .settings(
      crossScalaVersions := Seq("2.13.8", "3.1.1"),
      scalaVersion := "2.13.8",
      libraryDependencies += "org.typelevel" %% "cats-core" % "2.7.0"
    )

lazy val `works-in-scala-3` =
  project
    .settings(
      scalaVersion := "3.1.1",
      libraryDependencies += "org.typelevel" %% "cats-core" % "2.7.0"
    )
