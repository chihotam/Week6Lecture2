package functions

object Numbers {
  def cycle(num: Int): Int = {
    if (num == 0) {
      num
    }
    else if (num == 1) {
      num
    }
    else {
      cycle(num - 1) + cycle(num - 2)
    }
  }

  def fib(num: Int): Int = {
    cycle(num)
  }

  def averageInRange(lis: List[Double]): (Double, Double) => Double = {
    (num1: Double, num2: Double) => {
      val filtered: List[Double] = lis.filter(_ > num1).filter(_ < num2)
      filtered.sum/filtered.length
    }
  }
}
