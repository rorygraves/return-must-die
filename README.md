
An interesting benchmark on using return, vs not using return, vs using a pre-created throwable
Based on gist by @StefanZeiger 

https://twitter.com/StefanZeiger/status/790951342118436864

*Better results
```

[info] # JMH 1.14.1 (released 36 days ago)
[info] # VM version: JDK 1.8.0_101, VM 25.101-b13
[info] # VM invoker: /usr/lib/jvm/java-8-oracle/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 10 iterations, 1 s each
[info] # Measurement: 10 iterations, 20 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Throughput, ops/time

info] Benchmark                             Mode  Cnt      Score     Error   Units
[info] BasicReturn2Benchmark.benchmark      thrpt   10  22207.470 ± 152.246  ops/ms
[info] BasicReturnBenchmark.benchmark       thrpt   10  21408.810 ±  45.466  ops/ms
[info] NoReturnBenchmark.benchmark          thrpt   10  17629.575 ±   9.880  ops/ms
[info] NoReturnUpdated2Benchmark.benchmark  thrpt   10  17720.366 ±  52.477  ops/ms
[info] NoReturnUpdatedBenchmark.benchmark   thrpt   10  17604.105 ±  19.964  ops/ms
[info] ThrowingReturnBenchmark.benchmark    thrpt   10  22510.390 ± 331.643  ops/ms

```


*Original results

```
[info] Benchmark                                Mode  Cnt      Score      Error   Units
[info] BasicReturnBenchmark.basidBenchmark     thrpt    5  22815.387 ±  785.951  ops/ms
[info] NoReturnBenchmark.basidBenchmark        thrpt    5  24419.071 ±  674.971  ops/ms
[info] ThrowingReturnBenchmark.basidBenchmark  thrpt    5  29270.142 ± 1276.297  ops/ms
```

Improvements/suggestions welcome!

