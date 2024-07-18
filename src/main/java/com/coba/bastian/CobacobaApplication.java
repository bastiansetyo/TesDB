package com.coba.bastian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(
scanBasePackages = {
		"com.coba.bastian.data",
		"com.coba.bastian.repository"
		})
@EnableTransactionManagement
public class CobacobaApplication {
	public static void main(String[] args) {
		SpringApplication.run(CobacobaApplication.class, args);
	}

}
