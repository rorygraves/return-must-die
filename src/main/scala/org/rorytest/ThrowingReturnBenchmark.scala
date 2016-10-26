package org.rorytest

class ThrowingReturnBenchmark extends ReturnBenchmarkBase {

  import org.rorytest.BenchmarkData.Escape

  def find(a: Array[Array[Int]], v: Int): (Int, Int) = {
    var x, y = 0
    try {
      var i = 0
      while(i < a.length) {
        val aa = a(i)
        var j = 0
        while(j < aa.length) {
          if(aa(j) == v) {
            x = i
            y = j
            throw Escape
          }
          j += 1
        }
        i += 1
      }
      null
    } catch {
      case Escape => (x, y)
    }
  }
}
