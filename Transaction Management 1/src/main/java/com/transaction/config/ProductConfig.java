package com.transaction.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.transaction.service", "com.transaction.repository"})
public class ProductConfig {
	
	@Bean
	public  DataSource datasource() {
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/productnew", "root", "root");
		
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(datasource());
		
	}

}
