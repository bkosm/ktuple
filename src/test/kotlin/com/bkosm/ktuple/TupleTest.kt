package com.bkosm.ktuple

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue
import kotlin.test.expect

internal class TupleTest {
    private val uut: Tuple = Tuple(1)

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
        val (first) = uut as TupleOf1

        expect(1) { first }
    }

    @Test
    fun `values can be accessed via properties`() {
        uut as TupleOf1

        expect(1) { uut._1 }
    }

    @Test
    fun `values can be accessed via indexing`() {
        expect(1) { uut[0] }
        assertThrows<IndexOutOfBoundsException> { uut[1] }
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
    fun `you can do a standard data class 'copy' when the full type is present`() {
        val uut: Tuple.Of2<Int, Double> = t(1, 2.0)

        expect(t(1, 3.0)) { uut.copy(_2 = 3.0) }
    }

    @Test
    fun `you can do a copy with type change through a member function when the full type is present`() {
        val uut: Tuple.Of2<Int, Double> = t(1, 2.0)

        expect(t(null, "hey!")) { uut._2("hey!")._1(null) }
    }

    @Test
    fun `plus operator converts tuples into a list`() {
        val res = uut + t(2, 3) + t(4.0) + listOf(5f)

        expect(listOf<Any?>(1, 2, 3, 4.0, 5f)) { res }
    }

    @Test
    fun `you can search and do all of the collection operations`() {
        val res = uut.firstOrNull { it == 1 }

        expect(1) { res }
    }

    @Test
    fun `you can also append to the tuple itself`() {
        val resultForValidTuple = uut.appendOrNull(2.0)
        val resultForOverflow = AllVariations.last().second.appendOrNull(2.0)

        expect(t(1, 2.0)) { resultForValidTuple }
        assertNull(resultForOverflow)
    }

    @Test
    fun `there is a typesafe and fancy inline factory`() {
        val fullResult = 1 w 2 w 3 w 4 w 5 w 6 w 7 w 8 w 9 w 10
        val overflownResult: Tuple = 1 w 2 w 3 w 4 w 5 w 6 w 7 w 8 w 9 w 10 w 11 w 12

        expect(t(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { fullResult }
        expect(t(fullResult, 11, 12)) { overflownResult }
    }
}
