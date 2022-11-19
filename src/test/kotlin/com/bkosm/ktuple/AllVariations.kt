package com.bkosm.ktuple

private val Tuple.classToIt
    get() = let { it::class.java.simpleName to it }

internal val AllVariations = listOf(
    t(1).classToIt,
    t(1, 2L).classToIt,
    t(1, 2L, 3.0).classToIt,
    t(1, 2L, 3.0, 4).classToIt,
    t(1, 2L, 3.0, 4, 5L).classToIt,
    t(1, 2L, 3.0, 4, 5L, 6.0).classToIt,
    t(1, 2L, 3.0, 4, 5L, 6.0, 7).classToIt,
    t(1, 2L, 3.0, 4, 5L, 6.0, 7, 8L).classToIt,
    t(1, 2L, 3.0, 4, 5L, 6.0, 7, 8L, 9.0).classToIt,
    t(1, 2L, 3.0, 4, 5L, 6.0, 7, 8L, 9.0, 10).classToIt,
)
