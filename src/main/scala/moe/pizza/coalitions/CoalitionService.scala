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
  implicit def jsonEncoderHack[A](implicit e: Encoder[A]): EntityEncoder[A] =
    jsonEncoderOf(e)
  import Coalitions.{Coalitions => AllCoalitions}
  case class Error(message: String)

  "Render the swagger UI if called directly" **
    GET |>> TemporaryRedirect(Uri(path = "/swagger-ui"))

  "List Coalitions" **
    GET / "coalitions" / "" |>> Ok(AllCoalitions.values.toList)

  "Get Coalition by name" **
    GET / "coalitions" / 'name / "" |>> { (name: String) =>
    AllCoalitions
      .get(name)
      .map(Ok(_))
      .getOrElse(NotFound(Error(s"unable to find a coalition called $name")))

  }

  "Get the Coalitions for an Alliance, by ID" **
    GET / "alliances" / pathVar[Long]("id") / "" |>> { (id: Long) =>
    Ok(
      AllCoalitions.filter(_._2.alliances.exists(_.id == id))
    )
  }

  "Get the Coalitions for an Alliance, by Name" **
    GET / "alliances" / "" +? param[String]("name") |>> { (name: String) =>
    Ok(
      AllCoalitions.filter(_._2.alliances.exists(_.name == name))
    )

  }

}
