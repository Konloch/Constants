# Constants
Constants is a very small zero dependency Java library packed with constants.

## How To Add As Library
Add it as a maven dependency or just [download the latest release](https://github.com/Konloch/Constants/releases).
```xml
<dependency>
  <groupId>com.konloch</groupId>
  <artifactId>Constants</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Links
* [Website](https://konloch.com/Constants/)
* [Discord Server](https://discord.gg/aexsYpfMEf)
* [Download Releases](https://github.com/Konloch/Constants/releases)

## How To Use
There are four main constant categories, Milliseconds, Nanoseconds, Integer and Long.

This library leverages the fact that constant expressions in Java turn into static numbers rather than being numerically expressed.

So on a bytecode level when compiled, `x = 5 * MS.HOUR` turns into `x = 18000000`. This makes using the constants in this library extremely performant.

Milliseconds are under MS, Nanoseconds are under NS, Integer is under INT and Long is under LONG.