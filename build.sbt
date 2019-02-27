name := "scr"

organization := "com.github.lettenj61"

version := "0.1"

scalaVersion := "2.12.8"

crossScalaVersions := Seq("2.11.12", "2.12.8")

libraryDependencies ++= Seq(
  "org.scala-sbt" %% "librarymanagement-ivy" % "1.2.2",
  "org.scala-sbt" %% "io" % "1.2.2"
)