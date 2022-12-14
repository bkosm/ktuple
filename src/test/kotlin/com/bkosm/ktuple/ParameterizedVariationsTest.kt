package com.bkosm.ktuple

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import java.util.Optional
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertTrue
import kotlin.test.expect

internal class ParameterizedVariationsTest {
    private val element = AtomicInteger(1)

    @TestFactory
    fun contains() = AllVariations.map { (name, tuple) ->
        dynamicTest("for $name") {
            assertTrue { tuple.contains(1) }
            assertFalse { tuple.contains(-1) }
            assertFalse { tuple.contains(null) }
        }
    }

    @TestFactory
    fun containsAll() = AllVariations.drop(1).map { (name, tuple) ->
        dynamicTest("for $name") {
            assertTrue { tuple.containsAll(listOf<Any?>(1, 2L)) }
            assertFalse { tuple.containsAll(listOf<Any?>(-1, 1, 2L)) }
        }
    }

    @TestFactory
    fun isEmpty() = AllVariations.map { (name, tuple) ->
        dynamicTest("for $name") {
            assertFalse { tuple.isEmpty() }
        }
    }

    @TestFactory
    fun iterator() = AllVariations.map { (name, tuple) ->
        dynamicTest("for $name") {
            var runs = 0
            for (any in tuple) {
                runs++
            }

            expect(element.getAndIncrement()) { runs }
        }
    }

    @TestFactory
    fun size() = AllVariations.map { (name, tuple) ->
        dynamicTest("for $name") {
            expect(element.getAndIncrement()) { tuple.size }
        }
    }

    @TestFactory
    fun appendOrNull() = AllVariations.dropLast(1).map { (name, tuple) ->
        dynamicTest("for $name") {
            assertNotNull(tuple.appendOrNull(null))
        }
    }

    @Suppress("MoveVariableDeclarationIntoWhen")
    @Test
    fun `handles 'when' statement`() {
        val uut: Tuple = AllVariations.map { it.second }.maxByOrNull { it.size }!!

        val result = when (uut) {
            is TupleOf1 -> Optional.empty()
            is TupleOf2 -> Optional.empty()
            is TupleOf3 -> Optional.empty()
            is TupleOf4 -> Optional.empty()
            is TupleOf5 -> Optional.empty()
            is TupleOf6 -> Optional.empty()
            is TupleOf7 -> Optional.empty()
            is TupleOf8 -> Optional.empty()
            is TupleOf9 -> Optional.empty()
            is TupleOf10 -> Optional.of(1)
        }

        assertTrue { result.isPresent }
    }
}
