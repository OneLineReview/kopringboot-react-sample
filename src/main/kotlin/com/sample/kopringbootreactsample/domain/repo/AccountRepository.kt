package com.sample.kopringbootreactsample.domain.repo

import com.sample.kopringbootreactsample.domain.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository : JpaRepository<Account, Long> {
}