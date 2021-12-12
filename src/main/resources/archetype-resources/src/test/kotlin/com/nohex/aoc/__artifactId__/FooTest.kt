package com.nohex.aoc.${artifactId}

import com.nohex.aoc.PuzzleInput
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class FooTest {
    @Test
    fun testExample() {
        val input = PuzzleInput("example.txt").asSequence()
        val sut = Foo(input)
        sut.getSolution() shouldBe 0
    }
}
