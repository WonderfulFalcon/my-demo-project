package com.example.demo

import com.fasterxml.jackson.dataformat.xml.XmlMapper
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.io.File

class XmlMapperTest {
    @Test
    @Disabled
    fun serializeToXml() {
        val xmlMapper: XmlMapper = XmlMapper()

        val car1 = Car(-1, "UAZ", CarColor.GREEN)

        val xml: String = xmlMapper.writeValueAsString(car1)

        assertEquals("<Car><id>-1</id><model>UAZ</model><color>GREEN</color></Car>", xml)

        File("F:/car1.xml").writeText(xml)
    }

    data class Car(
            val id: Long,
            val model: String,
            val color: CarColor
    )

    enum class CarColor {
        GREEN, RED
    }
}