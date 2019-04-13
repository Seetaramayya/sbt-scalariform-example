import sbt._
import Keys._

object Dependencies {

  val test = "org.scalatest" %% "scalatest" % "3.0.5" % Test
  val check = "org.scalacheck" %% "scalacheck" % "1.13.4" % Test

  val module1Dependencies: Seq[ModuleID] = Seq(
    test
  )

  val module2Dependencies: Seq[ModuleID] = Seq(
    test,
    check
  )

  val mainModule: Seq[ModuleID] = Seq(
    test
  )

}
