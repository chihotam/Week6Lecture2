package tests

import org.scalatest._
import functions.Numbers

class TestAverageInRange extends FunSuite {
  test("") {
    assert(Numbers.averageInRange(List(1.0,1.25,2.0,1.75,1.5))(1.0,2.0) == 1.5)
    assert(Numbers.averageInRange(List(1.0,1.25,1.5,1.75,2.0))(4.0,5.0) != 0.0)
    assert(Numbers.averageInRange(List(1.0,1.25,1.5,1.75,2.0))(1.0,1.0) != 0.0)
    assert(Numbers.averageInRange(List(1.0,1.25,1.5,1.75,2.0))(1.0,1.5) == 1.25)
    assert(Numbers.averageInRange(List(1.0,1.25,1.5,1.75,2.0))(1.0,1.25) != 0.0)
    assert(Numbers.averageInRange(List(1.0,1.25,1.5,1.75,2.0))(2.0,1.0) != 0.0)
  }
}
