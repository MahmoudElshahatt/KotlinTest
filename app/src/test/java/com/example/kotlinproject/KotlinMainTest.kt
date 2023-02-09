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
    @Test
    fun should_ReturnAverage_When_HaveCorrectInput() {
        //Given
        val age = 10
        val height = 110
        //When
       val average= getAverageGrowth(age,height)
        //Then
        assertEquals(11,average)
    }
    @Test
    fun should_ReturnAverage_When_AverageCanBeRounded() {
        //Given
        val age = 18
        val height = 192
        //When
        val average= getAverageGrowth(age,height)
        //Then
        assertEquals(11,average)
    }
    @Test
    fun should_ReturnMinus1_When_AgeLargerThan18() {
        //Given
        val age = 25
        val height = 175
        //When
        val average= getAverageGrowth(age,height)
        //Then
        assertEquals(-1,average)
    }
    @Test
    fun should_ReturnMinus1_When_AgeIsZero() {
        //Given
        val age =0
        val height = 175
        //When
        val average= getAverageGrowth(age,height)
        //Then
        assertEquals(-1,average)
    }
    @Test
    fun should_ReturnMinus1_When_AgeIsNegative() {
        //Given
        val age =-5
        val height = 175
        //When
        val average= getAverageGrowth(age,height)
        //Then
        assertEquals(-1,average)
    }
    @Test
    fun should_ReturnMinus1_When_HeightSmallerThan30() {
        //Given
        val age =16
        val height = 25
        //When
        val average= getAverageGrowth(age,height)
        //Then
        assertEquals(-1,average)
    }
    @Test
    fun should_ReturnMinus1_When_WrongAgeAndHeight() {
        //Given
        val age =-4
        val height = 300
        //When
        val average= getAverageGrowth(age,height)
        //Then
        assertEquals(-1,average)
    }
}