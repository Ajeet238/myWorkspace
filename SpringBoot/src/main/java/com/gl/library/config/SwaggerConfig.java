package com.gl.library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
// this annotation will load swagger api
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket libraryApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(ApiInfo())
				.groupName("Library-API")
				.select().apis(RequestHandlerSelectors.basePackage("com.gl.library.controller"))
				.build();
	}
// method to customize the home page of swagger api
	public ApiInfo ApiInfo() {
		// TODO Auto-generated method stub
		return new ApiInfoBuilder().title("Library-API")
				.description("swagger api")
				.termsOfServiceUrl("https://www.youtube.com/watch?v=RidICa1pobg")
				.contact(new Contact("Library-API", "https://www.youtube.com/watch?v=RidICa1pobg", "fakelibrary@gmail.com"))
				.license("Library Licence")
				.licenseUrl("https://www.youtube.com/watch?v=RidICa1pobg")
				.version("1.0")
				.build();
				
	}
}
