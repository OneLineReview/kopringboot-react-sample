package com.sample.kopringbootreactsample.service

import com.sample.kopringbootreactsample.domain.Account
import com.sample.kopringbootreactsample.domain.repo.AccountRepository
import lombok.AllArgsConstructor
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@AllArgsConstructor
@Service
class AccountService(
    val accountRepository: AccountRepository
) {
    fun getName(id: Long): String {
        val account: Account? = accountRepository.findByIdOrNull(id)

        return account?.name ?: "Exception Case"
    }

    fun getEmail(id: Long): String {
        val account: Account? = accountRepository.findByIdOrNull(id)

        return account?.email ?: "Exception Case"
    }
}
