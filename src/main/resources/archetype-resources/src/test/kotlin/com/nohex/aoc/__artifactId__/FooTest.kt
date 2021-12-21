package com.nohex.aoc.${artifactId}

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

internal class FooTest : ShouldSpec({
    context("The example puzzle input") {
        val input = getInput("example.txt")
        val sut = Foo(input)

        should("produce the expected result") {
            sut.getSolution() shouldBe 0
        }
    }
})
