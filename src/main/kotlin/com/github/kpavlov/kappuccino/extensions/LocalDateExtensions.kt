@file:Suppress("unused")

package com.github.kpavlov.kappuccino.extensions

import java.time.LocalDate
import java.time.ZoneId
import java.util.*

private val utcZone = ZoneId.of("UTC")

fun LocalDate?.toDate(): Date? = if (this != null) Date.from(this.atStartOfDay(utcZone).toInstant()) else null
