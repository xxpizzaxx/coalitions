package moe.pizza.coalitions

object Data {
  case class Alliance(name: String, id: Long)
  case class Corporation(name: String, id: Long)
  case class Coalition(alliances: List[Alliance], corporations: List[Corporation], coalitions: List[Coalition])
  object Coalition {
    def apply(as: List[Alliance]): Coalition = apply(as, List.empty, List.empty)
  }
}
