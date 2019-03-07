@file:Suppress("unused")

package com.github.kpavlov.kappuccino.extensions

import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneOffset

fun LocalDateTime?.toOffsetDateTime(): OffsetDateTime? = this?.atOffset(ZoneOffset.UTC)
