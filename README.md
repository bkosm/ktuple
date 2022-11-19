# ktuple

![tests](https://github.com/bkosm/ktuple/actions/workflows/gradle.yml/badge.svg)
![coverage](.github/badges/jacoco.svg)
![branches](.github/badges/branches.svg)
[![](https://jitpack.io/v/bkosm/ktuple.svg)](https://jitpack.io/#bkosm/ktuple)

## easy to use tuples to speed up the creation of dynamic tests

https://github.com/bkosm/ktuple/blob/177d3df260289116ef5420cc8ad1f64a75f26387/src/test/kotlin/com/bkosm/ktuple/examples/InMemoryPowerCalcTest.kt#L18-L29

## tests make the best documentation

https://github.com/bkosm/ktuple/blob/7e5b3b52347e645aa60043dff2f3f97dcfbd6e88/src/test/kotlin/com/bkosm/ktuple/TupleTest.kt#L9-L108

## currently available via JitPack

```kts
repositories {
    // all the other ones that you might need...

    maven { url = uri("https://jitpack.io") }
}

// and then

dependencies {
    // all the other ones that you might need...
    
    testImplementation("com.github.bkosm:ktuple:1.1.0")
}
```

## you decide on the features!

Drop an issue with what functionality you could use in your Kotlin tuple or submit a PR!
