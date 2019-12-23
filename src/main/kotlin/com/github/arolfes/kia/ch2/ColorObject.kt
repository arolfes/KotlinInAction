package com.github.arolfes.kia.ch2

object ColorObject {

    // when for choose correct enum value
    fun getMnemonic(color: Color) =
            when (color) {
                Color.RED -> "Richard"
                Color.ORANGE -> "Of"
                Color.YELLOW -> "York"
                Color.GREEN -> "Gave"
                Color.BLUE -> "Batlle"
                Color.INDIGO -> "In"
                Color.VIOLET -> "Vain"
            }

    fun getWarmth(color: Color) =
            when (color) {
                Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
                Color.GREEN -> "neutral"
                Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
            }

    // setOf for using 2 arguments in when compare
    // advantage: easy to read
    // disadvantage: extra objects in memory (creates several sets)
    fun mix(c1: Color, c2: Color) =
            when (setOf(c1, c2)) {
                setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
                setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
                setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
                else -> throw Exception("Dirty Color")
            }

    // using when without an argument
    // advantage: no extra objects
    // disadvantage: harder to read
    fun mixOptimized(c1: Color, c2: Color) =
            when {
                (c1 == Color.RED && c2 == Color.YELLOW) ||
                        (c1 == Color.YELLOW && c2 == Color.RED)
                -> Color.ORANGE
                (c1 == Color.YELLOW && c2 == Color.BLUE) ||
                        (c1 == Color.BLUE && c2 == Color.YELLOW)
                -> Color.GREEN
                (c1 == Color.VIOLET && c2 == Color.BLUE) ||
                        (c1 == Color.BLUE && c2 == Color.VIOLET)
                -> Color.INDIGO
                else -> throw Exception("Dirty Color")

            }

}