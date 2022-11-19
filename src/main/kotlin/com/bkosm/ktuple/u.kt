package com.bkosm.ktuple

infix fun Any?.u(other: Any?) =
    Tuple(this, other)

infix fun To2.u(other: Any?) =
    appendOrNull(other)!! as To3

infix fun To3.u(other: Any?) =
    appendOrNull(other)!! as To4

infix fun To4.u(other: Any?) =
    appendOrNull(other)!! as To5

infix fun To5.u(other: Any?) =
    appendOrNull(other)!! as To6
