@file:Suppress("unused")

package com.github.kpavlov.kappuccino.extensions

import java.time.Instant
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.ZoneOffset
import java.util.*

fun Date?.toLocalDate(): LocalDate? =
    if (this != null) LocalDate.from(this.toInstant().atOffset(ZoneOffset.UTC)) else null

fun Date?.toOffsetDateTime(): OffsetDateTime? =
    if (this != null) Instant.ofEpochMilli(this.time).atOffset(ZoneOffset.UTC) else null
