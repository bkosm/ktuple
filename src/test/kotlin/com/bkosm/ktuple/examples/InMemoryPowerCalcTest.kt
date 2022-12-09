@file:Suppress("PrivatePropertyName")

package com.bkosm.ktuple.examples

import com.bkosm.ktuple.Tuple
import com.bkosm.ktuple.examples.InMemoryPowerCalcTest.PowerCalc
import com.bkosm.ktuple.w
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.math.pow
import kotlin.test.expect

internal typealias Arguments = Tuple.Of4<Number, Number, Double, String>

internal class InMemoryPowerCalcTest {
    fun interface PowerCalc : (Number, Double) -> Double {
        companion object
    }

    private val PowerCalc.Companion.InMemory get() = PowerCalc { a, b -> a.toDouble().pow(b) }

    @TestFactory
    fun `handles exponentiation as expected`() = listOf(
        1 w 2 w 1.0 w "with exponent of 2",
        2 w 2 w 4.0 w "with base of 2",
        2.2 w 3.3 w 13.489468760533386 w "with doubles",
        Arguments(3, 3, 27.0, "with exponents higher than 2"), // can work like named tuples
    ).map { (a: Number, b: Number, result: Double, name: String) ->
        dynamicTest(name) {
            val uut = PowerCalc.InMemory
            expect(result) { uut(a, b.toDouble()) }
        }
    }
}
