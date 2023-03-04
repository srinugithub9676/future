package com.org.future;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("proud")
public class FamilyFutureApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) 
	{
	return application.sources(FamilyFutureApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(FamilyFutureApplication.class, args);
		System.out.println("hello");

	}

}
