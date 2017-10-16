package moe.pizza.coalitions

import scala.concurrent.ExecutionContext
import org.http4s.Request
import org.http4s.Response
import org.http4s.StaticFile
import org.http4s.dsl._
import org.http4s.HttpService
import fs2.Task
import fs2.interop.cats._

object StaticContentService {

  private val swaggerUiDir = "/swagger-ui"

  def fetchResource(path: String, req: Request): Task[Response] = {
    StaticFile.fromResource(path, Some(req)).getOrElseF(NotFound())
  }

  /**
    * Routes for getting static resources. These might be served more efficiently by apache2 or nginx,
    * but its nice to keep it self contained
    */
  def routes(implicit executionContext: ExecutionContext = ExecutionContext.global): HttpService = HttpService {
    // Swagger User Interface
    case req @ GET -> Root / "swagger-ui" =>
      fetchResource(swaggerUiDir + "/index.html", req)
    case req @ GET -> Root / "swagger-ui-standalone-preset.js" =>
      fetchResource(swaggerUiDir + "/swagger-ui-standalone-preset.js", req)
    case req @ GET -> Root / "swagger-ui.css" =>
      fetchResource(swaggerUiDir + "/swagger-ui.css", req)
    case req @ GET -> Root / "swagger-ui-bundle.js" =>
      fetchResource(swaggerUiDir + "/swagger-ui-bundle.js", req)
    case req @ GET -> Root / path =>
      fetchResource(swaggerUiDir + path, req)
  }

}
