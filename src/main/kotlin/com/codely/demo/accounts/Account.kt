package com.codely.demo.accounts

import java.math.BigDecimal
import java.time.LocalDate
import java.util.*

data class Account(
    val id: UUID,
    val iban: String,
    val type: String,
    val balance: BigDecimal,
    val createdAt: LocalDate
)