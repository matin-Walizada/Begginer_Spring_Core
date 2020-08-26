package com.spring.mvc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.jdbc.MysqlDataSource;

@Configuration
public class DbConfig {

	@Bean("jdbcTemplate")
	public JdbcTemplate createTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(this.dataSource());
		return jdbcTemplate;
	}

	@Bean
	public DataSource dataSource() {
		MysqlDataSource mysqlDS = new MysqlDataSource();
		mysqlDS.setURL("jdbc:mysql://localhost:3306/employee_directory?createDatabaseIfNotExist=true");
		mysqlDS.setUser("matin");
		mysqlDS.setPassword("1989");
		return mysqlDS;
	}

}
