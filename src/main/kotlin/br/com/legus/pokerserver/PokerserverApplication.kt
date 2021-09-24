package br.com.legus.pokerserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PokerserverApplication

fun main(args: Array<String>) {
	runApplication<PokerserverApplication>(*args)
}
