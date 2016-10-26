package org.rorytest

class NoReturnBenchmark extends ReturnBenchmarkBase {

  def find(a: Array[Array[Int]], v: Int): (Int, Int) = {
    def f(i: Int): (Int, Int) = {
      if(i < a.length) {
        val aa = a(i)
        def g(j: Int): (Int, Int) = {
          if(j < aa.length) {
            if(aa(j) == v) (i, j) else g(j+1)
          } else null
        }
        val r = g(0)
        if(r ne null) r else f(i+1)
      } else null
    }
    f(0)
  }
}
