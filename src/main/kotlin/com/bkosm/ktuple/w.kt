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
