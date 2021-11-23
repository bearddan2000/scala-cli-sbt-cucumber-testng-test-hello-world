lazy val root = (project in file("."))
  .enablePlugins(CucumberPlugin)
  .settings(

  CucumberPlugin.glues := List(""),

  // Any environment properties you want to override/set.
  CucumberPlugin.envProperties := Map("K"->"2049"),

  // Project name (artifact name in Maven)
  name := "(scala-cli-sbt-cucumber-testng)",

  // orgnization name (e.g., the package name of the project)
  organization := "example",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Treasure Data Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := true,

  libraryDependencies ++= Seq(
    "io.cucumber" % "cucumber-bom" % "7.0.0" pomOnly(),
    "io.cucumber" % "cucumber-java" % "latest.release",
    "io.cucumber" % "cucumber-testng" % "latest.release",
   ),

  mainClass := Some("example.Main")
)
