@file:Suppress("UNCHECKED_CAST")

package com.bkosm.ktuple

infix fun <T1, T2> T1.w(other: T2) =
    Tuple(this, other)

infix fun <T1, T2, T3> Tuple.Of2<T1, T2>.w(other: T3) =
    appendOrNull(other)!! as Tuple.Of3<T1, T2, T3>

infix fun <T1, T2, T3, T4> Tuple.Of3<T1, T2, T3>.w(other: T4) =
    appendOrNull(other)!! as Tuple.Of4<T1, T2, T3, T4>

infix fun <T1, T2, T3, T4, T5> Tuple.Of4<T1, T2, T3, T4>.w(other: T5) =
    appendOrNull(other)!! as Tuple.Of5<T1, T2, T3, T4, T5>

infix fun <T1, T2, T3, T4, T5, T6> Tuple.Of5<T1, T2, T3, T4, T5>.w(other: T6) =
    appendOrNull(other)!! as Tuple.Of6<T1, T2, T3, T4, T5, T6>

infix fun <T1, T2, T3, T4, T5, T6, T7> Tuple.Of6<T1, T2, T3, T4, T5, T6>.w(other: T7) =
    appendOrNull(other)!! as Tuple.Of7<T1, T2, T3, T4, T5, T6, T7>

infix fun <T1, T2, T3, T4, T5, T6, T7, T8> Tuple.Of7<T1, T2, T3, T4, T5, T6, T7>.w(other: T8) =
    appendOrNull(other)!! as Tuple.Of8<T1, T2, T3, T4, T5, T6, T7, T8>

infix fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple.Of8<T1, T2, T3, T4, T5, T6, T7, T8>.w(other: T9) =
    appendOrNull(other)!! as Tuple.Of9<T1, T2, T3, T4, T5, T6, T7, T8, T9>

infix fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple.Of9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.w(other: T10) =
    appendOrNull(other)!! as Tuple.Of10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>
