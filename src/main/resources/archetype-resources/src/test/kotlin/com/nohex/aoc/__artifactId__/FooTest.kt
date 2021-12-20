package com.nohex.aoc.${artifactId}

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class FooTest: StringSpec({
    "The example puzzle input produces the reported result" {
        val input = getInput("example.txt")
        val sut = Foo(input)
        sut.getSolution() shouldBe 0
    }
})
