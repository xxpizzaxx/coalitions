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
