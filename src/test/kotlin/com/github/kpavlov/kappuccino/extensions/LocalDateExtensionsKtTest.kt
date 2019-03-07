package com.github.kpavlov.kappuccino.extensions

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test
import java.time.LocalDateTime
import java.time.ZoneOffset

internal class LocalDateExtensionsKtTest {

    @Test
    fun `should convert to OffsetDateTime`() {
        val src = java.time.LocalDateTime.now()
        val result = src.toOffsetDateTime()
        result?.toInstant() shouldBe src.toInstant(ZoneOffset.UTC)
    }

    @Test
    fun `should convert null`() {
        val receiver: LocalDateTime? = null
        receiver.toOffsetDateTime() shouldBe null
    }
}