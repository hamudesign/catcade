package design.hamu

import sbt._

object Plugins {
  object Scalafmt {
    private val version = "2.0.4"
    val core: ModuleID = "org.scalameta" % "sbt-scalafmt" % version
  }
  object ScalaJS {
    private val version = "0.6.29"
    val core: ModuleID = "org.scala-js" % "sbt-scalajs" % version
  }
  object SBTPgp {
    private val version = "2.0.0"
    val core: ModuleID ="com.jsuereth" % "sbt-pgp" % version
  }
  object SBTSonatype {
    private val version = "3.8"
    val core: ModuleID ="org.xerial.sbt" % "sbt-sonatype" % version
  }
  object SBTUpdates {
    private val version = "0.5.0"
    val core: ModuleID = "com.timushev.sbt" % "sbt-updates" % version
  }
  object SCoverage {
    private val version = "1.6.0"
    val core: ModuleID = "org.scoverage" % "sbt-scoverage" % version
  }
}
