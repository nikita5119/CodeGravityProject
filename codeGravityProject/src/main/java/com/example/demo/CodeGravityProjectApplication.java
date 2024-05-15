package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication //indicates its the starting point of this application.

@ComponentScan({"mvc.aspects","mvc.controller.ui","mvc.service"})
//repository/data access layer package name
@EnableJpaRepositories("mvc.dataAccessLayer")
@EntityScan({"mvc.dataAccessLayer"})
@EnableTransactionManagement
public class CodeGravityProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeGravityProjectApplication.class, args);
	}

}




