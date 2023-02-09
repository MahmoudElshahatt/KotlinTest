package com.example.kotlinproject


fun main() {
    println(sum(2, 3) == 5)
}

fun sum(a: Int, b: Int) = a + b
fun isEven(num: Int) = num % 2 == 0
fun divide(a: Int, b: Int) = a / b

fun getAverageGrowth(age:Int,height:Int):Int{
    if(age !in 1..18) return -1
    if(height !in 30..210) return -1
 return height/age
}