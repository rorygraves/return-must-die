package org.rorytest

import scala.annotation.tailrec

class NoReturnUpdatedBenchmark extends ReturnBenchmarkBase {

  @inline @tailrec private final def f(a: Array[Array[Int]], v: Int, i: Int): (Int, Int) = {
    if(i < a.length) {
      val aa = a(i) 
      @inline @tailrec def g(j: Int): (Int, Int) = {
        if(j < aa.length) {
          if(aa(j) == v) (i, j) else g(j+1)
        } else null
      }
      val r = g(0)
      if(r ne null) r else f(a, v, i+1)
    } else null
  }

  def find(a: Array[Array[Int]], v: Int): (Int, Int) = {
    f(a,v, 0)
  }
}
