package com.nohex.aoc.${artifactId}

import com.nohex.aoc.PuzzleInput

fun main() {
    val input = getInput("input.txt")
    val solution = Foo(input)
        .getSolution()

    println("${artifactId}, part 1: $solution")
}

fun getInput(path: String) =
    PuzzleInput(path).asSequence()
