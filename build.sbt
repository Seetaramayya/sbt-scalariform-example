import Dependencies._

lazy val module1 = (project in file("module1")).
  settings(
    commonSettings,
    libraryDependencies ++= module1Dependencies
  )

lazy val module2 = project
  .settings(
    commonSettings,
    libraryDependencies ++= module2Dependencies
  )

lazy val main = project
  .settings(
    commonSettings
  )
  .dependsOn(module1, module2)
  .configs(Test)

lazy val root = (project in file("."))
  .aggregate(module1, module2, main)
  .settings(
    scalariformWithBaseDirectory := true,
    scalariformFormat / includeFilter := "*.scala" || "*.sbt"
  )

lazy val commonSettings = Seq(
  organization := "com.seeta",
  version := "0.0.1" + sys.props.getOrElse("buildNumber", default = "0-SNAPSHOT"),
  scalaVersion := "2.12.0",
  publishMavenStyle := true,
  publishArtifact in Test := false,
  scalariformFormat / includeFilter := "*.scala"
)

lazy val testSettings = Seq(
  Test / fork := false,
  Test / parallelExecution := false
)

lazy val itSettings = Defaults.itSettings ++ Seq(
  IntegrationTest / logBuffered := false,
  IntegrationTest / fork := true
)
