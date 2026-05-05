object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(87, 79, 26, 18, 4)
    assert(Policy.score(signalcase_1) == 85)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(99, 102, 27, 14, 12)
    assert(Policy.score(signalcase_2) == 160)
    assert(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(98, 103, 14, 5, 9)
    assert(Policy.score(signalcase_3) == 241)
    assert(Policy.classify(signalcase_3) == "accept")
  }
}
