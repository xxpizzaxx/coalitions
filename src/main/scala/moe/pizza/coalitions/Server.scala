package moe.pizza.coalitions

import fs2.{Stream, Task}
import org.http4s.{Service, StaticFile}
import org.http4s.rho.swagger.SwaggerSupport
import org.http4s.rho.swagger.models.Info
import org.http4s.util.StreamApp
import org.http4s.server.Server
import org.http4s.server.blaze.BlazeBuilder

import scala.concurrent.ExecutionContext

object BlazeExample extends StreamApp {
  val middleware = SwaggerSupport(apiInfo = Info("Coalition API", "0.1.0"))

  override def stream(args: List[String]): Stream[Task, Nothing] =
    BlazeBuilder
      .bindHttp(8080, "0.0.0.0")
      .mountService(Service.withFallback(StaticContentService.routes)(CoalitionService.toService(middleware)))
      .serve
}
