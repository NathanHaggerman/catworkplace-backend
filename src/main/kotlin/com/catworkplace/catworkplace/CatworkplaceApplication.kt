package com.catworkplace.catworkplace

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CatworkplaceApplication

fun main(args: Array<String>) {
	runApplication<CatworkplaceApplication>(*args)
}
