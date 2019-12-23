package com.github.arolfes.kia.ch2

object ExpObject {
    fun eval(e: Exp): Int {
        if (e is Num) {
            val n = e as Num
            return n.value
        }
        if (e is Sum) {
            val n = e as Sum
            return eval(n.right) + eval(n.left)
        }
        throw IllegalArgumentException("Unknown expression")
    }

    fun eval2(e: Exp): Int =
            if (e is Num) {
                e.value
            } else if (e is Sum) {
                eval(e.right) + eval(e.left)
            } else {
                throw IllegalArgumentException("Unknown expression")
            }


    fun eval3(e: Exp): Int =
            when (e) {
                is Num -> e.value
                is Sum -> eval(e.right) + eval(e.left)
                else -> throw IllegalArgumentException("Unknown expression")
            }

    fun evalWithLogging(e: Exp): Int =
            when (e) {
                is Num -> {
                    println("num: ${e.value}")
                    e.value
                }
                is Sum -> {
                    val left = evalWithLogging(e.left)
                    val right = evalWithLogging(e.right)
                    println("sum: $left + $right")
                    left + right
                }
                else -> throw IllegalArgumentException("Unknown expression")
            }
}