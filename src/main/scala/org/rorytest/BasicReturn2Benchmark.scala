package org.rorytest

// basic return with array lengths extracted
class BasicReturn2Benchmark extends ReturnBenchmarkBase {

  override def find(a: Array[Array[Int]], v: Int): (Int, Int) = {
    var i = 0
    val aLen = a.length
    while(i < aLen) {
      val aa = a(i)
      var j = 0
      val aaLen = aa.length
      while(j < aaLen) {
        if(aa(j) == v) return (i, j)
        j += 1
      }
      i += 1
    }
    null
  }
}
