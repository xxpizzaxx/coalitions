package moe.pizza.coalitions

object Data {
  case class Alliance(name: String, id: Long)
  //case class Corporation(name: String, id: Long)
  case class Coalition(name: String, alliances: List[Alliance] = List.empty, coalitions: List[Coalition] = List.empty)
}
