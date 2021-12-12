package com.nohex.aoc.${artifactId}

import com.nohex.aoc.PuzzleInput

fun main() {
    val input = PuzzleInput("input.txt").asSequence()

    val solution = Foo(input).getSolution()

    println("${artifactId}, part 1: $solution")
}
