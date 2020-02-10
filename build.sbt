import design.hamu.Dependencies

lazy val common = Seq(
  organization := "design.hamu",
  version := "0.0.1-SNAPSHOT",
  scalacOptions += "-Ypartial-unification"
)

lazy val publishSettings = Seq(
  scalacOptions := {
    scalaBinaryVersion.value match {
      case v if v.startsWith("2.12") => Seq("-Ypartial-unification")
      case v if v.startsWith("2.13") => Seq("-Xlint", "-Ywarn-unused")
      case _ => Seq()
    }
  }
)

lazy val root = project
  .in(file("."))
  .settings(common)
  .settings(
    skip in publish := true
  )
  .aggregate(core)

lazy val core = project
  .in(file("core"))
  .settings(
    name := "catcade-core",
    common,
    libraryDependencies ++= Seq(
      Dependencies.Cats.effect.scala.value
    ) ++ Seq(
      Dependencies.LWJGL.core.java.value
    ).flatMap(module => Seq(
      module,
      module classifier "natives-windows"
    ))
  )
