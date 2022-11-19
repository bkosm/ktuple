package com.bkosm.ktuple

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue
import kotlin.test.expect

internal class TupleTest {
    private val uut: Tuple.Of1<Int> = Tuple(1)

    @Test
    fun `there is a size property`() {
        expect(1) { uut.size }
    }

    @Test
    fun `there is a 'contains' check`() {
        assertTrue { uut.contains(1) }
        assertFalse { uut.contains(2L) }
    }

    @Test
    fun `there is a 'containsAll' check`() {
        assertTrue { uut.containsAll(listOf<Any?>(1)) }
        assertFalse { uut.containsAll(listOf<Any?>(1, 2)) }
    }

    @Test
    fun `can be inline destructured`() {
        val (first) = uut

        expect(1) { first }
    }

    @Test
    fun `values can be accessed via properties`() {
        expect(1) { uut._1 }
    }

    @Test
    fun `can be iterated over`() {
        var runs = 0
        for (any in uut) {
            runs++
        }

        expect(1) { runs }
    }

    @Test
    fun `has a emptiness check`() {
        assertFalse { uut.isEmpty() }
    }

    @Test
    fun `null only tuple is considered empty`() {
        assertTrue { Tuple(null, null).isEmpty() }
    }

    @Test
    fun `typealias works with factory functions`() {
        val uut = t(null)

        assertNull(uut._1)
    }

    @Test
    fun `you can do a standard copy to change a value`() {
        val uut = t(1, 2.0)

        expect(t(1, 3.0)) { uut.copy(_2 = 3.0) }
    }

    @Test
    fun `plus operator converts tuples into a list`() {
        val res = uut + t(2, 3) + t(4.0)

        expect(listOf<Any?>(1, 2, 3, 4.0)) { res }
    }

    @Test
    fun `you can also append to the tuple itself`() {
        val resultForValidTuple = uut.appendOrNull(2.0)
        val resultForOverflow = AllVariations.last().second.appendOrNull(2.0)

        expect(t(1, 2.0)) { resultForValidTuple }
        expect(null) { resultForOverflow }
    }
}
