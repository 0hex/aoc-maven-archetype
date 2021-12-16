package com.nohex.aoc.${artifactId}

import com.nohex.aoc.PuzzleInput

fun main() {
    val input = getInput("input.txt")
    val solution = Foo(input)
        .getSolution()

    println("${artifactId}, part 1: $solution")
}

private fun getInput(path: String) =
    PuzzleInput("input.txt").asSequence()
