# ktuple

![tests](https://github.com/bkosm/ktuple/actions/workflows/gradle.yml/badge.svg)
![coverage](.github/badges/jacoco.svg)
![branches](.github/badges/branches.svg)
[![](https://jitpack.io/v/bkosm/ktuple.svg)](https://jitpack.io/#bkosm/ktuple)

A kotlin-native library introducing a tuple data class as a standard Collection implementation. 
It supports entries up to 10 in size, providing excellent DX on top.

## easy to use tuples to speed up the creation of dynamic tests

https://github.com/bkosm/ktuple/blob/177d3df260289116ef5420cc8ad1f64a75f26387/src/test/kotlin/com/bkosm/ktuple/examples/InMemoryPowerCalcTest.kt#L18-L29

## tests make the best documentation

https://github.com/bkosm/ktuple/blob/593a02d7ac1040d0af5c939856355d90f065468b/src/test/kotlin/com/bkosm/ktuple/TupleTest.kt#L9-L115

## currently available via JitPack

```kts
repositories {
    // all the other ones that you might need...

    maven { url = uri("https://jitpack.io") }
}

// and then

dependencies {
    // all the other ones that you might need...
    
    testImplementation("com.github.bkosm:ktuple:1.3.0")
}
```

## you decide on the features!

Drop an issue with what functionality you could use in your Kotlin tuple or submit a PR!
