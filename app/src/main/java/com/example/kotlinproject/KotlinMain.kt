package com.example.kotlinproject

import kotlin.math.roundToInt


fun main() {
    println(getAverageGrowth(18,192))
}

fun sum(a: Int, b: Int) = a + b
fun isEven(num: Int) = num % 2 == 0
fun divide(a: Int, b: Int) = a / b

fun getAverageGrowth(age: Int, height: Int): Int {
    if (age !in 1..18 || height !in 30..210) return -1
    return (1f * height / age).roundToInt()
}