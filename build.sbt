lazy val `breaks-in-scala-3` =
  project
    .settings(
      crossScalaVersions := Seq("2.13.16", "3.6.0"),
      scalaVersion := "2.13.16",
      libraryDependencies += "org.typelevel" %% "cats-core" % "2.7.0"
    )

lazy val `works-in-scala-3` =
  project
    .settings(
      crossScalaVersions := Seq("2.13.16", "3.6.0"),
      scalaVersion := "3.6.0",
      libraryDependencies += "org.typelevel" %% "cats-core" % "2.7.0"
    )
