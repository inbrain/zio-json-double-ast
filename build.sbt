ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.16"

lazy val root = (project in file("."))
  .settings(
    name := "VerifyJson"
  )
  .settings(
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio-json" % "0.7.19",
      "org.specs2" %% "specs2-junit" % "4.20.9" % Test
    )
  )
