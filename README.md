# ktuple

![tests](https://github.com/bkosm/ktuple/actions/workflows/gradle.yml/badge.svg)
![coverage](.github/badges/jacoco.svg)
![branches](.github/badges/branches.svg)
[![](https://jitpack.io/v/bkosm/ktuple.svg)](https://jitpack.io/#bkosm/ktuple)

## easy to use tuples to speed up the creation of dynamic tests

https://github.com/bkosm/ktuple/blob/df512179ce058865822f448c049bbfe9f1872a4b/src/test/kotlin/io/bkosm/ktuple/examples/InMemoryPowerCalcTest.kt#L10-L32

## tests make the best documentation

https://github.com/bkosm/ktuple/blob/911c231bb61ce6cf03edf01a8aed6fbad8b847b0/src/test/kotlin/io/bkosm/ktuple/TupleTest.kt#L9-L65

## currently available via JitPack

```kts
import java.net.URI

repositories {
    // all the other ones that you might need...

    maven { url = URI("https://jitpack.io") }
}

// and then

dependencies {
    // all the other ones that you might need...
    
    testImplementation("com.github.bkosm:ktuple:1.0.1")
}
```

## you decide on the features!

Drop an issue with what functionality you could use in your Kotlin tuple (if you didn't already write a extenstion function for it).
