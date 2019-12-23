package com.github.arolfes.kia.ch1

data class Person(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Stefan"), Person("Peter", 55), Person("Ralf", 40))
    val oldest = persons.maxBy { p -> p.age ?: 0 }
    println("The oldest is $oldest")
}