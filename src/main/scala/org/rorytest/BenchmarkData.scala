package org.rorytest

object BenchmarkData {

  val a = Array(Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(1,2,3), Array(42))

  case object Escape extends RuntimeException with scala.util.control.NoStackTrace
}
