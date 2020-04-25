package net.cfiet.thanos.sqlbackend

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import javax.sql.DataSource

@Configuration
class DatabaseSourceConfig {

    @Bean
    fun database(dataSource: DataSource): NamedParameterJdbcTemplate =
            NamedParameterJdbcTemplate(dataSource)
}