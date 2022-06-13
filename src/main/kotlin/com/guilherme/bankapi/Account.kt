package com.guilherme.bankapi

import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Entity

@Entity(name="account")
data class Account (
    @Id @GeneratedValue
    var id: Long? = null,
    val name: String,
    val document: String,
    val phone: String
)