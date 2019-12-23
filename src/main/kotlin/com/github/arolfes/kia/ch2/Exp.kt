package com.github.arolfes.kia.ch2

interface Exp
class Num(val value: Int) : Exp
class Sum(val left: Exp, val right: Exp) : Exp



