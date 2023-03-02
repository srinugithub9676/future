package com.org.future.Configration;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Component
@EnableSwagger2
public class SwaggerConfiguration {
	
	@Bean
	public Docket getDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("public-apis")
				.apiInfo(getApiInfo()).select()
				//.apis(RequestHandlerSelectors.basePackage("com.example.java.controller"))
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.build();
	}
	public ApiInfo getApiInfo() {
		return new ApiInfoBuilder().title("srinu java test")
				.description("api  created by srinu").build();
		
	}

}
