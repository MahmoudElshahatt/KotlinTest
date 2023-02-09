package com.example.kotlinproject

import org.junit.Assert.*
import org.junit.Test


internal class KotlinMainTest {

    @Test
    fun sumTest() {
        assertEquals(7, sum(5, 2))
    }

    @Test
    fun isEvenTest() {
        assertTrue(isEven(4))
    }

    @Test
    fun should_ReturnTrue_When_NumberIsEven() {
        assertTrue(isEven(4))
    }

    @Test
    fun isEven_TheNumberEven_ReturnTrue() {
        //Given
        val num = 4
        //When
        val actual = isEven(num)
        //Then
        assertTrue(actual)
    }

    @Test
    fun should_ThrowException_When_DivideOnZero() {
        //Given
        val num1 = 5
        val num2 = 0
        //When
        //Divide on Zero  val result = { divide(num1, num2) }
        //Then
        assertThrows(Exception::class.java) { divide(num1, num2) }
    }
}