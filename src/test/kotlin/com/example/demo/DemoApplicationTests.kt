package com.example.demo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {
    /**
     * Steps of Reproduce:
     * - Create breakpoint on line 23
     * - Debug [com.example.demo.DemoApplicationTests.filter]
     * - Open "Evaluate expression..." window
     * - Run 'exampleCollection.filter { it.name == "name-34" }'
     */
    @Test
    fun filter() {
        val exampleCollection: List<ExampleDataClass> =
                (0 until 1000).map { id ->
                    ExampleDataClass(id, "name-$id")
                }
        assertEquals(
                listOf(ExampleDataClass(34, "name-34")),
                exampleCollection.filter { it.name == "name-34" })
    }
}

data class ExampleDataClass(
        val id: Int,
        val name: String
)
