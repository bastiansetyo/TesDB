package com.coba.bastian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(
scanBasePackages = {
//		"com.coba.bastian.data",
		"com.coba.bastian"
		})
@EnableTransactionManagement
public class CobacobaApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CobacobaApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(CobacobaApplication.class, args);
	}

}
