package com.bkosm.ktuple

import org.junit.jupiter.api.Test
import kotlin.test.expect

@Suppress("TestFunctionName")
internal class CopyTest {
    @Test
    fun Of1() {
        val uut = t(1)

        expect(t("hey")) { uut._1("hey") }
    }

    @Test
    fun Of2() {
        val uut = t(1, 2.0)

        expect(t("hey", 2.0)) { uut._1("hey") }
        expect(t(1, "hey")) { uut._2("hey") }
    }

    @Test
    fun Of3() {
        val uut = t(1, 2.0, 3L)

        expect(t("hey", 2.0, 3L)) { uut._1("hey") }
        expect(t(1, "hey", 3L)) { uut._2("hey") }
        expect(t(1, 2.0, "hey")) { uut._3("hey") }
    }

    @Test
    fun Of4() {
        val uut = t(1, 2.0, 3L, 1)

        expect(t("hey", 2.0, 3L, 1)) { uut._1("hey") }
        expect(t(1, "hey", 3L, 1)) { uut._2("hey") }
        expect(t(1, 2.0, "hey", 1)) { uut._3("hey") }
        expect(t(1, 2.0, 3L, "hey")) { uut._4("hey") }
    }

    @Test
    fun Of5() {
        val uut = t(1, 2.0, 3L, 1, 2.0)

        expect(t("hey", 2.0, 3L, 1, 2.0)) { uut._1("hey") }
        expect(t(1, "hey", 3L, 1, 2.0)) { uut._2("hey") }
        expect(t(1, 2.0, "hey", 1, 2.0)) { uut._3("hey") }
        expect(t(1, 2.0, 3L, "hey", 2.0)) { uut._4("hey") }
        expect(t(1, 2.0, 3L, 1, "hey")) { uut._5("hey") }
    }

    @Test
    fun Of6() {
        val uut = t(1, 2.0, 3L, 1, 2.0, 3L)

        expect(t("hey", 2.0, 3L, 1, 2.0, 3L)) { uut._1("hey") }
        expect(t(1, "hey", 3L, 1, 2.0, 3L)) { uut._2("hey") }
        expect(t(1, 2.0, "hey", 1, 2.0, 3L)) { uut._3("hey") }
        expect(t(1, 2.0, 3L, "hey", 2.0, 3L)) { uut._4("hey") }
        expect(t(1, 2.0, 3L, 1, "hey", 3L)) { uut._5("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, "hey")) { uut._6("hey") }
    }

    @Test
    fun Of7() {
        val uut = t(1, 2.0, 3L, 1, 2.0, 3L, 1)

        expect(t("hey", 2.0, 3L, 1, 2.0, 3L, 1)) { uut._1("hey") }
        expect(t(1, "hey", 3L, 1, 2.0, 3L, 1)) { uut._2("hey") }
        expect(t(1, 2.0, "hey", 1, 2.0, 3L, 1)) { uut._3("hey") }
        expect(t(1, 2.0, 3L, "hey", 2.0, 3L, 1)) { uut._4("hey") }
        expect(t(1, 2.0, 3L, 1, "hey", 3L, 1)) { uut._5("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, "hey", 1)) { uut._6("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, 3L, "hey")) { uut._7("hey") }
    }

    @Test
    fun Of8() {
        val uut = t(1, 2.0, 3L, 1, 2.0, 3L, 1, 2.0)

        expect(t("hey", 2.0, 3L, 1, 2.0, 3L, 1, 2.0)) { uut._1("hey") }
        expect(t(1, "hey", 3L, 1, 2.0, 3L, 1, 2.0)) { uut._2("hey") }
        expect(t(1, 2.0, "hey", 1, 2.0, 3L, 1, 2.0)) { uut._3("hey") }
        expect(t(1, 2.0, 3L, "hey", 2.0, 3L, 1, 2.0)) { uut._4("hey") }
        expect(t(1, 2.0, 3L, 1, "hey", 3L, 1, 2.0)) { uut._5("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, "hey", 1, 2.0)) { uut._6("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, 3L, "hey", 2.0)) { uut._7("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, 3L, 1, "hey")) { uut._8("hey") }
    }

    @Test
    fun Of9() {
        val uut = t(1, 2.0, 3L, 1, 2.0, 3L, 1, 2.0, 3L)

        expect(t("hey", 2.0, 3L, 1, 2.0, 3L, 1, 2.0, 3L)) { uut._1("hey") }
        expect(t(1, "hey", 3L, 1, 2.0, 3L, 1, 2.0, 3L)) { uut._2("hey") }
        expect(t(1, 2.0, "hey", 1, 2.0, 3L, 1, 2.0, 3L)) { uut._3("hey") }
        expect(t(1, 2.0, 3L, "hey", 2.0, 3L, 1, 2.0, 3L)) { uut._4("hey") }
        expect(t(1, 2.0, 3L, 1, "hey", 3L, 1, 2.0, 3L)) { uut._5("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, "hey", 1, 2.0, 3L)) { uut._6("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, 3L, "hey", 2.0, 3L)) { uut._7("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, 3L, 1, "hey", 3L)) { uut._8("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, 3L, 1, 2.0, "hey")) { uut._9("hey") }
    }

    @Test
    fun Of10() {
        val uut = t(1, 2.0, 3L, 1, 2.0, 3L, 1, 2.0, 3L, 1)

        expect(t("hey", 2.0, 3L, 1, 2.0, 3L, 1, 2.0, 3L, 1)) { uut._1("hey") }
        expect(t(1, "hey", 3L, 1, 2.0, 3L, 1, 2.0, 3L, 1)) { uut._2("hey") }
        expect(t(1, 2.0, "hey", 1, 2.0, 3L, 1, 2.0, 3L, 1)) { uut._3("hey") }
        expect(t(1, 2.0, 3L, "hey", 2.0, 3L, 1, 2.0, 3L, 1)) { uut._4("hey") }
        expect(t(1, 2.0, 3L, 1, "hey", 3L, 1, 2.0, 3L, 1)) { uut._5("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, "hey", 1, 2.0, 3L, 1)) { uut._6("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, 3L, "hey", 2.0, 3L, 1)) { uut._7("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, 3L, 1, "hey", 3L, 1)) { uut._8("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, 3L, 1, 2.0, "hey", 1)) { uut._9("hey") }
        expect(t(1, 2.0, 3L, 1, 2.0, 3L, 1, 2.0, 3L, "hey")) { uut._10("hey") }
    }
}
