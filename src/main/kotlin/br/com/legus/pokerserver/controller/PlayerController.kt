package br.com.legus.pokerserver.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PlayerController {

    @GetMapping("/player")
    fun getPlayer(): String {
        return "Nome do Jogador"
    }
}