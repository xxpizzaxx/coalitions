package moe.pizza.coalitions

import moe.pizza.coalitions.Data.Coalition
import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.dsl._
import org.http4s.rho.RhoService
import org.http4s.rho._
import org.http4s.rho.swagger._
import io.circe._, io.circe.generic.auto._, io.circe.syntax._
import org.http4s.implicits._

object CoalitionService extends RhoService {
  implicit def jsonEncoderHack[A](implicit e: Encoder[A]): EntityEncoder[A] = jsonEncoderOf(e)

  "Render the swagger UI if called directly" **
    GET |>> TemporaryRedirect(Uri(path = "/swagger-ui"))

  "List Coalitions" **
    GET / "coalitions" |>> Ok(List(Coalitions.GeminateCo))

}
