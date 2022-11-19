package com.bkosm.ktuple.examples

import com.bkosm.ktuple.Tuple
import com.bkosm.ktuple.examples.InMemoryPowerCalcTest.PowerCalc
import com.bkosm.ktuple.t
import com.bkosm.ktuple.u
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
        1 u 2 u 1.0 u "with exponent of 2",
        2 u 2 u 4.0 u "with base of 2",
        3 u 3 u 27.0 u "with exponents higher than 2",
        2.2 u 3.3 u 13.489468760533386 u "with doubles",
    ).map { (a, b, result, name) ->
        dynamicTest(name) {
            val uut = PowerCalc.inMemory
            expect(result) { uut(a, b.toDouble()) }
        }
    }
}
