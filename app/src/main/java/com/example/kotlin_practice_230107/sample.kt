package com.example.kotlin_practice_230107

fun main() {
    helloWorld()

    println(add(a=4, b=5))
}

// FUNCTION SYNTAX

fun helloWorld() : Unit {
    println("Hello Kotlin!")
}

fun add(a: Int, b: Int):Int {
    return a+b
}

// VAL vs. VAR

fun hi() {
    val a : Int = 10
    var b : Int = 9
    b = 100
    var c = 100
    var d : String
    var name : string = "noru"
}