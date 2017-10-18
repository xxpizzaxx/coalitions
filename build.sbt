enablePlugins(sbtdocker.DockerPlugin, JavaAppPackaging)

organization := "moe.pizza"
name := "coalitions"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.12.3"

val Http4sVersion = "0.17.4"
val RhoVersion = "0.17.0"
val CirceVersion = "0.8.0"
val LogbackVersion = "1.2.3"

resolvers += Resolver.jcenterRepo

libraryDependencies ++= Seq(
 "org.http4s"     %% "http4s-blaze-server" % Http4sVersion,
 "org.http4s"     %% "http4s-circe"        % Http4sVersion,
 "org.http4s"     %% "http4s-dsl"          % Http4sVersion,
 "org.http4s"     %% "rho-swagger"         % RhoVersion,
 "org.http4s"     %% "rho-core"            % RhoVersion,
 "io.circe"       %% "circe-generic"       % CirceVersion,
 "ch.qos.logback" %  "logback-classic"     % LogbackVersion
)

packageName in Docker := "andimiller/coalitions"

dockerfile in docker := {
  val appDir: File = stage.value
  val targetDir = "/app"

  new Dockerfile {
    from("java")
    entryPoint(s"$targetDir/bin/${executableScriptName.value}")
    copy(appDir, targetDir, chown = "daemon:daemon")
  }
}

import ReleaseTransformations._
releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  ReleaseStep(releaseStepTask(publish in Docker)),
  setNextVersion,
  commitNextVersion,
  pushChanges
)
