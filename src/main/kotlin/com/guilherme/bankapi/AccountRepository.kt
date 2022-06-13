package com.guilherme.bankapi

import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository <Account, Long> {
}