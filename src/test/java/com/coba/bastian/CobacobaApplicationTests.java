package com.coba.bastian;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(
		scanBasePackages = {
				"com.coba.bastian"
		})
@EnableTransactionManagement
public class CobacobaApplicationTests extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CobacobaApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CobacobaApplication.class, args);
	}

}