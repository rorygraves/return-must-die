package org.rorytest

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations.Mode._
import org.openjdk.jmh.annotations._

@BenchmarkMode(Array(Throughput))
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 5)
@Measurement(iterations = 5, time = 10, timeUnit = TimeUnit.SECONDS)
@Fork(value = 1)
abstract class ReturnBenchmarkBase {

  import BenchmarkData._

  def find(a: Array[Array[Int]], v: Int): (Int, Int)

    @Benchmark
  def basidBenchmark(): Unit = {
      find(a, 42)
  }

}
