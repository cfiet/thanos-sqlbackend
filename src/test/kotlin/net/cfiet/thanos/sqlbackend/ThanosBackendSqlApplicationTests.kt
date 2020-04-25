package net.cfiet.thanos.sqlbackend

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate

@SpringBootTest
class ThanosBackendSqlApplicationTests {

	@Autowired
	lateinit var db: NamedParameterJdbcTemplate

	@Test
	fun contextLoads() {
	}

}
