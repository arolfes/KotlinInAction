package com.github.arolfes.kia.ch2

import org.junit.Test
import com.github.arolfes.kia.ch2.Color.*

class Chapter2Scratches {

    @Test
    fun run( ) {
        val rect = Rectangle(41, 43)
        println(rect.isSquare)

        val rect2 = Rectangle(43, 43)
        println(rect2.isSquare)

        println(INDIGO.rgb())

        println(ColorObject.getWarmth(INDIGO))

        println(ColorObject.getMnemonic(BLUE))

        println(ColorObject.mix(RED, YELLOW))

        println(ColorObject.mixOptimized(BLUE, VIOLET))

        println(ExpObject.eval(Sum(Sum(Num(1), Num(2)), Num(4))))
        println(ExpObject.eval2(Sum(Sum(Num(1), Num(2)), Num(4))))
        println(ExpObject.evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
    }
}