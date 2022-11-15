package io.bkosm.ktuple

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import kotlin.test.expect

internal class ParameterizedVariationsTest {
    private companion object {
        val TestSet = listOf(
            t("Of1", t(1)),
            t("Of2", t(1, 2L)),
            t("Of3", t(1, 2L, 3.0)),
            t("Of4", t(1, 2L, 3.0, 4)),
            t("Of5", t(1, 2L, 3.0, 4, 5L)),
            t("Of6", t(1, 2L, 3.0, 4, 5L, 6.0)),
        )
    }

    private val element = AtomicInteger(1)

    @TestFactory
    fun contains() = TestSet.map { (name, tuple) ->
        dynamicTest("for $name") {
            assertTrue { tuple.contains(1) }
            assertFalse { tuple.contains(-1) }
            assertFalse { tuple.contains(null) }
        }
    }

    @TestFactory
    fun containsAll() = TestSet.drop(1).map { (name, tuple) ->
        dynamicTest("for $name") {
            assertTrue { tuple.containsAll(listOf<Any?>(1, 2L)) }
            assertFalse { tuple.containsAll(listOf<Any?>(-1, 1, 2L)) }
        }
    }

    @TestFactory
    fun isEmpty() = TestSet.map { (name, tuple) ->
        dynamicTest("for $name") {
            assertFalse { tuple.isEmpty() }
        }
    }

    @TestFactory
    fun iterator() = TestSet.map { (name, tuple) ->
        dynamicTest("for $name") {
            var runs = 0
            for (any in tuple) {
                runs++
            }

            expect(element.getAndIncrement()) { runs }
        }
    }

    @TestFactory
    fun size() = TestSet.map { (name, tuple) ->
        dynamicTest("for $name") {
            expect(element.getAndIncrement()) { tuple.size }
        }
    }
}
