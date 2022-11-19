package com.bkosm.ktuple

internal val AllVariations = listOf(
    Tuple.Of1::class.java.simpleName to t(1),
    Tuple.Of2::class.java.simpleName to t(1, 2L),
    Tuple.Of3::class.java.simpleName to t(1, 2L, 3.0),
    Tuple.Of4::class.java.simpleName to t(1, 2L, 3.0, 4),
    Tuple.Of5::class.java.simpleName to t(1, 2L, 3.0, 4, 5L),
    Tuple.Of6::class.java.simpleName to t(1, 2L, 3.0, 4, 5L, 6.0),
)
