package net.cfiet.thanos.sqlbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ThanosBackendSqlApplication

fun main(args: Array<String>) {
	runApplication<ThanosBackendSqlApplication>(*args)
}
