package moe.pizza.coalitions

object Data {
  case class Alliance(name: String, id: Long)
  case class Corporation(name: String, id: Long)
  case class Coalition(name: String, alliances: List[Alliance], corporations: List[Corporation], coalitions: List[Coalition])
  object Coalition {
    def apply(name: String, as: List[Alliance]): Coalition = apply(name, as, List.empty, List.empty)
    def apply(name: String, cs: List[Coalition]): Coalition = apply(name, List.empty, List.empty, cs)
    def apply(name: String, as: List[Alliance], cs: List[Coalition]): Coalition = apply(name, as, List.empty, cs)
  }
}
