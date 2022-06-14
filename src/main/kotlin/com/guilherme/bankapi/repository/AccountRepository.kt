package com.guilherme.bankapi.repository

import com.guilherme.bankapi.model.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository <Account, Long> {
}