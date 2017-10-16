package moe.pizza.coalitions

object Coalitions {
  import Data._

  val GeminateCo = Coalition(
    List(
      Alliance("Legion of xXDEATHXx", 1411711376),
      Alliance("Infinity Space.", 99003355),
      Alliance("Shadow of xXDEATHXx", 99003500),
      Alliance("Advent of Fate", 99003722),
      Alliance("Synergy of Steel", 99002685),
      Alliance("Everyb0dy Lies", 99004302),
      Alliance("Invictum.", 99005884),
      Alliance("Prothean Alliance", 99005360)
    )
  )
  val DroneControlUnit = Coalition(
    List(
      Alliance("Infinity Space.", 99003355),
      Alliance("Ultimate Space", 99003574),
      Alliance("Digital Vendetta", 99006438),
      Alliance("Shadow of xXDEATHXx", 99003500),
      Alliance("Nemesis Enterprises.", 99003322),
      Alliance("The Explicit Alliance", 99003244),
      Alliance("Da Imbalance", 99006756),
      Alliance("RAZOR Alliance", 741557221),
      Alliance("CyberSphere", 99005334),
      Alliance("Blue Sun Interstellar Technologies", 99007439),
      Alliance("inPanic", 99005803),
      Alliance("TERRA REGNUM", 99002396),
      Alliance("Badfellas Inc.", 99006356),
      Alliance("Ghost Legion.", 99007293),
      Alliance("Brothers of Tangra", 99003006)
    )
  )
  val DRF = Coalition(List(Alliance("SOLAR FLEET", 1208295500)), List.empty, List(GeminateCo, DroneControlUnit))

}
