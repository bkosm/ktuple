package com.bkosm.ktuple

infix fun Any?.u(other: Any?) =
    Tuple(this, other)

infix fun TupleOf2.u(other: Any?) =
    appendOrNull(other)!! as TupleOf3

infix fun TupleOf3.u(other: Any?) =
    appendOrNull(other)!! as TupleOf4

infix fun TupleOf4.u(other: Any?) =
    appendOrNull(other)!! as TupleOf5

infix fun TupleOf5.u(other: Any?) =
    appendOrNull(other)!! as TupleOf6
