package org.rorytest

class BasicReturnBenchmark extends ReturnBenchmarkBase {

  override def find(a: Array[Array[Int]], v: Int): (Int, Int) = {
    var i = 0
    while(i < a.length) {
      val aa = a(i)
      var j = 0
      while(j < aa.length) {
        if(aa(j) == v) return (i, j)
        j += 1
      }
      i += 1
    }
    null
  }
}
