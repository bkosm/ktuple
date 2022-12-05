package com.bkosm.ktuple

@Suppress("FunctionName")
sealed class Tuple private constructor(vararg elements: Any?) : Collection<Any?> {
    private val orderedValues = elements.toList()

    override fun contains(element: Any?) = orderedValues.contains(element)

    override fun containsAll(elements: Collection<Any?>) = orderedValues.containsAll(elements)

    override fun isEmpty() = orderedValues.filterNotNull().isEmpty()

    override fun iterator() = orderedValues.iterator()

    override val size = orderedValues.size

    fun appendOrNull(element: Any?): Tuple? = when (this) {
        is TupleOf1 -> Companion(_1, element)
        is TupleOf2 -> Companion(_1, _2, element)
        is TupleOf3 -> Companion(_1, _2, _3, element)
        is TupleOf4 -> Companion(_1, _2, _3, _4, element)
        is TupleOf5 -> Companion(_1, _2, _3, _4, _5, element)
        is TupleOf6 -> Companion(_1, _2, _3, _4, _5, _6, element)
        is TupleOf7 -> Companion(_1, _2, _3, _4, _5, _6, _7, element)
        is TupleOf8 -> Companion(_1, _2, _3, _4, _5, _6, _7, _8, element)
        is TupleOf9 -> Companion(_1, _2, _3, _4, _5, _6, _7, _8, _9, element)
        is TupleOf10 -> null
    }

    operator fun get(i: Int) = orderedValues[i]

    companion object {
        operator fun <T1> invoke(
            _1: T1
        ) = Of1(_1)

        operator fun <T1, T2> invoke(
            _1: T1, _2: T2
        ) = Of2(_1, _2)

        operator fun <T1, T2, T3> invoke(
            _1: T1, _2: T2, _3: T3
        ) = Of3(_1, _2, _3)

        operator fun <T1, T2, T3, T4> invoke(
            _1: T1, _2: T2, _3: T3, _4: T4
        ) = Of4(_1, _2, _3, _4)

        operator fun <T1, T2, T3, T4, T5> invoke(
            _1: T1, _2: T2, _3: T3, _4: T4, _5: T5
        ) = Of5(_1, _2, _3, _4, _5)

        operator fun <T1, T2, T3, T4, T5, T6> invoke(
            _1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6
        ) = Of6(_1, _2, _3, _4, _5, _6)

        operator fun <T1, T2, T3, T4, T5, T6, T7> invoke(
            _1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7
        ) = Of7(_1, _2, _3, _4, _5, _6, _7)

        operator fun <T1, T2, T3, T4, T5, T6, T7, T8> invoke(
            _1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8
        ) = Of8(_1, _2, _3, _4, _5, _6, _7, _8)

        operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> invoke(
            _1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9
        ) = Of9(_1, _2, _3, _4, _5, _6, _7, _8, _9)

        operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> invoke(
            _1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10
        ) = Of10(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10)
    }

    data class Of1<T1>(
        val _1: T1
    ) : Tuple(_1) {
        fun <NEW> _1(new: NEW) = Companion(new)

        companion object
    }

    data class Of2<T1, T2>(
        val _1: T1, val _2: T2
    ) : Tuple(_1, _2) {
        fun <NEW> _1(new: NEW) = Companion(new, _2)
        fun <NEW> _2(new: NEW) = Companion(_1, new)

        companion object
    }

    data class Of3<T1, T2, T3>(
        val _1: T1, val _2: T2, val _3: T3
    ) : Tuple(_1, _2, _3) {
        fun <NEW> _1(new: NEW) = Companion(new, _2, _3)
        fun <NEW> _2(new: NEW) = Companion(_1, new, _3)
        fun <NEW> _3(new: NEW) = Companion(_1, _2, new)

        companion object
    }

    data class Of4<T1, T2, T3, T4>(
        val _1: T1, val _2: T2, val _3: T3, val _4: T4
    ) : Tuple(_1, _2, _3, _4) {
        fun <NEW> _1(new: NEW) = Companion(new, _2, _3, _4)
        fun <NEW> _2(new: NEW) = Companion(_1, new, _3, _4)
        fun <NEW> _3(new: NEW) = Companion(_1, _2, new, _4)
        fun <NEW> _4(new: NEW) = Companion(_1, _2, _3, new)

        companion object
    }

    data class Of5<T1, T2, T3, T4, T5>(
        val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5
    ) : Tuple(_1, _2, _3, _4, _5) {
        fun <NEW> _1(new: NEW) = Companion(new, _2, _3, _4, _5)
        fun <NEW> _2(new: NEW) = Companion(_1, new, _3, _4, _5)
        fun <NEW> _3(new: NEW) = Companion(_1, _2, new, _4, _5)
        fun <NEW> _4(new: NEW) = Companion(_1, _2, _3, new, _5)
        fun <NEW> _5(new: NEW) = Companion(_1, _2, _3, _4, new)

        companion object
    }

    data class Of6<T1, T2, T3, T4, T5, T6>(
        val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6
    ) : Tuple(_1, _2, _3, _4, _5, _6) {
        fun <NEW> _1(new: NEW) = Companion(new, _2, _3, _4, _5, _6)
        fun <NEW> _2(new: NEW) = Companion(_1, new, _3, _4, _5, _6)
        fun <NEW> _3(new: NEW) = Companion(_1, _2, new, _4, _5, _6)
        fun <NEW> _4(new: NEW) = Companion(_1, _2, _3, new, _5, _6)
        fun <NEW> _5(new: NEW) = Companion(_1, _2, _3, _4, new, _6)
        fun <NEW> _6(new: NEW) = Companion(_1, _2, _3, _4, _5, new)

        companion object
    }

    data class Of7<T1, T2, T3, T4, T5, T6, T7>(
        val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7
    ) : Tuple(_1, _2, _3, _4, _5, _6, _7) {
        fun <NEW> _1(new: NEW) = Companion(new, _2, _3, _4, _5, _6, _7)
        fun <NEW> _2(new: NEW) = Companion(_1, new, _3, _4, _5, _6, _7)
        fun <NEW> _3(new: NEW) = Companion(_1, _2, new, _4, _5, _6, _7)
        fun <NEW> _4(new: NEW) = Companion(_1, _2, _3, new, _5, _6, _7)
        fun <NEW> _5(new: NEW) = Companion(_1, _2, _3, _4, new, _6, _7)
        fun <NEW> _6(new: NEW) = Companion(_1, _2, _3, _4, _5, new, _7)
        fun <NEW> _7(new: NEW) = Companion(_1, _2, _3, _4, _5, _6, new)

        companion object
    }

    data class Of8<T1, T2, T3, T4, T5, T6, T7, T8>(
        val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8
    ) : Tuple(_1, _2, _3, _4, _5, _6, _7, _8) {
        fun <NEW> _1(new: NEW) = Companion(new, _2, _3, _4, _5, _6, _7, _8)
        fun <NEW> _2(new: NEW) = Companion(_1, new, _3, _4, _5, _6, _7, _8)
        fun <NEW> _3(new: NEW) = Companion(_1, _2, new, _4, _5, _6, _7, _8)
        fun <NEW> _4(new: NEW) = Companion(_1, _2, _3, new, _5, _6, _7, _8)
        fun <NEW> _5(new: NEW) = Companion(_1, _2, _3, _4, new, _6, _7, _8)
        fun <NEW> _6(new: NEW) = Companion(_1, _2, _3, _4, _5, new, _7, _8)
        fun <NEW> _7(new: NEW) = Companion(_1, _2, _3, _4, _5, _6, new, _8)
        fun <NEW> _8(new: NEW) = Companion(_1, _2, _3, _4, _5, _6, _7, new)

        companion object
    }

    data class Of9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(
        val _1: T1, val _2: T2, val _3: T3, val _4: T4, val _5: T5, val _6: T6, val _7: T7, val _8: T8, val _9: T9
    ) : Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9) {
        fun <NEW> _1(new: NEW) = Companion(new, _2, _3, _4, _5, _6, _7, _8, _9)
        fun <NEW> _2(new: NEW) = Companion(_1, new, _3, _4, _5, _6, _7, _8, _9)
        fun <NEW> _3(new: NEW) = Companion(_1, _2, new, _4, _5, _6, _7, _8, _9)
        fun <NEW> _4(new: NEW) = Companion(_1, _2, _3, new, _5, _6, _7, _8, _9)
        fun <NEW> _5(new: NEW) = Companion(_1, _2, _3, _4, new, _6, _7, _8, _9)
        fun <NEW> _6(new: NEW) = Companion(_1, _2, _3, _4, _5, new, _7, _8, _9)
        fun <NEW> _7(new: NEW) = Companion(_1, _2, _3, _4, _5, _6, new, _8, _9)
        fun <NEW> _8(new: NEW) = Companion(_1, _2, _3, _4, _5, _6, _7, new, _9)
        fun <NEW> _9(new: NEW) = Companion(_1, _2, _3, _4, _5, _6, _7, _8, new)

        companion object
    }

    data class Of10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(
        val _1: T1,
        val _2: T2,
        val _3: T3,
        val _4: T4,
        val _5: T5,
        val _6: T6,
        val _7: T7,
        val _8: T8,
        val _9: T9,
        val _10: T10
    ) : Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10) {
        fun <NEW> _1(new: NEW) = Companion(new, _2, _3, _4, _5, _6, _7, _8, _9, _10)
        fun <NEW> _2(new: NEW) = Companion(_1, new, _3, _4, _5, _6, _7, _8, _9, _10)
        fun <NEW> _3(new: NEW) = Companion(_1, _2, new, _4, _5, _6, _7, _8, _9, _10)
        fun <NEW> _4(new: NEW) = Companion(_1, _2, _3, new, _5, _6, _7, _8, _9, _10)
        fun <NEW> _5(new: NEW) = Companion(_1, _2, _3, _4, new, _6, _7, _8, _9, _10)
        fun <NEW> _6(new: NEW) = Companion(_1, _2, _3, _4, _5, new, _7, _8, _9, _10)
        fun <NEW> _7(new: NEW) = Companion(_1, _2, _3, _4, _5, _6, new, _8, _9, _10)
        fun <NEW> _8(new: NEW) = Companion(_1, _2, _3, _4, _5, _6, _7, new, _9, _10)
        fun <NEW> _9(new: NEW) = Companion(_1, _2, _3, _4, _5, _6, _7, _8, new, _10)
        fun <NEW> _10(new: NEW) = Companion(_1, _2, _3, _4, _5, _6, _7, _8, _9, new)

        companion object
    }
}
