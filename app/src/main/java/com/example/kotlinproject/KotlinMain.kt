package com.example.kotlinproject


fun main() {
    println(sum(2, 3) == 5)
}

fun sum(a: Int, b: Int) = a + b
fun isEven(num: Int) = num % 2 == 0
fun divide(a: Int, b: Int) = a / b