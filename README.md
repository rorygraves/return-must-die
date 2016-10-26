
An interesting benchmark on using return, vs not using return, vs using a pre-created throwable
Based on gist by @StefanZeiger 

https://twitter.com/StefanZeiger/status/790951342118436864

[info] Benchmark                                Mode  Cnt      Score      Error   Units
[info] BasicReturnBenchmark.basidBenchmark     thrpt    5  22815.387 ±  785.951  ops/ms
[info] NoReturnBenchmark.basidBenchmark        thrpt    5  24419.071 ±  674.971  ops/ms
[info] ThrowingReturnBenchmark.basidBenchmark  thrpt    5  29270.142 ± 1276.297  ops/ms
