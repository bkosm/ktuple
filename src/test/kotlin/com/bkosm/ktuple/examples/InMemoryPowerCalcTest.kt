package com.bkosm.ktuple.examples

import com.bkosm.ktuple.examples.InMemoryPowerCalcTest.PowerCalc
import com.bkosm.ktuple.w
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
        1 w 2 w 1.0 w "with exponent of 2",
        2 w 2 w 4.0 w "with base of 2",
        3 w 3 w 27.0 w "with exponents higher than 2",
        2.2 w 3.3 w 13.489468760533386 w "with doubles",
    ).map { (a, b, result, name) ->
        dynamicTest(name) {
            val uut = PowerCalc.inMemory
            expect(result) { uut(a, b.toDouble()) }
        }
    }
}
