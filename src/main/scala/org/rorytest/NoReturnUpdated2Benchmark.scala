package org.rorytest

import scala.annotation.tailrec

class NoReturnUpdated2Benchmark extends ReturnBenchmarkBase {

  @inline @tailrec private final def g(aa: Array[Int],v: Int, i: Int, j: Int): (Int, Int) = {
    if(j < aa.length) {
      if(aa(j) == v) (i, j) else g(aa,v, i, j+1)
    } else null
  }

  @inline @tailrec private final def f(a: Array[Array[Int]], v: Int, i: Int): (Int, Int) = {
    if(i < a.length) {
      val aa = a(i) 
      val r = g(aa,v, i, 0)
      if(r ne null) r else f(a, v, i+1)
    } else null
  }

  def find(a: Array[Array[Int]], v: Int): (Int, Int) = {
    f(a,v, 0)
  }
}
