package com.sample.kopringbootreactsample.controller

import com.sample.kopringbootreactsample.service.AccountService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class AccountController(
    private val accountService: AccountService
) {
    @GetMapping("/name/{id}")
    fun getName(@PathVariable id: Long? = null): ResponseEntity<String> {
        if (id == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(accountService.getName(id));
    }

    @GetMapping("/email/{id}")
    fun getEmail(@PathVariable id: Long? = null): ResponseEntity<String> {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(accountService.getEmail(id));
    }
}