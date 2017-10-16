package moe.pizza.coalitions

object Coalitions {
  import Data._

  lazy val GeminateCo = Coalition(
    "GeminateCo",
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
  lazy val DroneControlUnit = Coalition(
    "Drone Control Unit",
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
  lazy val Legacy = Coalition(
    "Legacy",
    List(
      Alliance("Test Alliance Please Ignore", 498125261),
      Alliance("Fidelas Constans", 1006830534),
      Alliance("Brave Collective", 99003214),
      Alliance("DRONE WALKERS", 99006297),
      Alliance("Integritas Constans", 99006734)
    )
  )
  lazy val SOLAR = Coalition(
    "SOLAR",
    List(
      Alliance("SOLAR FLEET", 1208295500),
      Alliance("SOLAR WING.", 99005108)
    )
  )
  lazy val DRF = Coalition(
    "DRF",
    List(GeminateCo, DroneControlUnit, Legacy, SOLAR)
  )

  lazy val Vanguard = Coalition(
    "Vanguard",
    List(
      Alliance("Triumvirate.", 933731581),
      Alliance("Fraternity.", 99003581),
      Alliance("League of Unaligned Master Pilots", 99005843),
      Alliance("Cohortes Triarii", 99005364),
      Alliance("Deus Vult.", 99006697),
      Alliance("Destiny's Call", 707482380),
    )
  )

  lazy val VanguardKrabs = Coalition(
    "Vanguard Krabs",
    List(
      Alliance("Stella Nova", 99005286),
      Alliance("Serrice Council.", 99004841),
      Alliance("Fraternity University", 99006406),
      Alliance("Ranger Regiment", 99007362),
      Alliance("Most Usual Suspects", 621338554),
      Alliance("Destiny's Call", 707482380),
      Alliance("Brothers Of The Dark Sun", 99003615),
      Alliance("SAMURAI SOUL'd OUT", 99006138),
    )
  )

  lazy val NCPL = Coalition(
    "NCPL",
    List(
      Alliance("Pandemic Legion", 386292982),
      Alliance("Northern Coalition.", 1727758877),
    ),
    List(GOTG, KrabFam)
  )

  lazy val KrabFam = Coalition(
    "KrabFam",
    List(
      Alliance("Pandemic Horde", 99005338),
      Alliance("Rate My Ticks", 99007044),
      Alliance("Here Be Dragons", 1555742183),
      Alliance("SLYCE Pirates", 99006125),
      Alliance("Brisingamen", 99006506),
      Alliance("Denomic Wheat Pineapple", 99006494),
    )
  )

  lazy val GOTG = Coalition(
    "GOTG",
    List(
      Alliance("DARKNESS.", 99002938),
      Alliance("Blades of Grass", 99005393),
      Alliance("Caladrius Alliance", 99001954),
      Alliance("ChaosTheory.", 99005955),
      Alliance("Mistakes Were Made.", 99002208),
      Alliance("Mordus Angels", 1301367357),
      Alliance("Solyaris Chtonium", 1042504553),
      Alliance("Out of Sight.", 99001011),
    ),
    List(KrabFam)
  )


  lazy val TheMemeperium = Coalition(
    "The Memeperium",
    List(
      Alliance("I too am Gay", 99006771),
      Alliance("At Fanfest", 99007734),
    )
  )
}
