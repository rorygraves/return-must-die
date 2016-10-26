package org.rorytest

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations.Mode._
import org.openjdk.jmh.annotations._

@BenchmarkMode(Array(Throughput))
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 10)
@Measurement(iterations = 10, time = 20, timeUnit = TimeUnit.SECONDS)
@Fork(value = 1)
abstract class ReturnBenchmarkBase {

  import BenchmarkData._

  def find(a: Array[Array[Int]], v: Int): (Int, Int)

    @Benchmark
  def benchmark(): Unit = {
      find(a, 42)
      find(a, 1)
  }

}
