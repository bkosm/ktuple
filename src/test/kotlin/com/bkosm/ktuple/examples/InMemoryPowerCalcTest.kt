package com.bkosm.ktuple.examples

import com.bkosm.ktuple.examples.InMemoryPowerCalcTest.PowerCalc
import com.bkosm.ktuple.t
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.math.pow
import kotlin.test.expect

internal class InMemoryPowerCalcTest {

    fun interface PowerCalc : (Number, Double) -> Double {
        companion object
    }

    private val PowerCalc.Companion.inMemory
        get() = PowerCalc { a, b -> a.toDouble().pow(b) }

    @TestFactory
    fun `it works!`() = listOf(
        t(1, 2, 1.0, "with exponent of 2"),
        t(2, 2, 4.0, "with base of 2"),
        t(3, 3, 27.0, "with exponents higher than 2"),
        t(2.2, 3.3, 13.489468760533386, "with doubles")
    ).map { (a, b, result, name) ->
        dynamicTest(name) {
            val uut = PowerCalc.inMemory
            expect(result) { uut(a, b.toDouble()) }
        }
    }

}
