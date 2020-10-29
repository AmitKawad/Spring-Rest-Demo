package com.SpringRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}

	@Bean
	ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Test API documentation	")
				.build();
	}

	@Bean
	public Docket swaggerConfiguration(){
		return  new Docket(DocumentationType.SWAGGER_2)
				.select()
				//.paths(PathSelectors.ant("/*/*"))
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.SpringRest.Controller"))
				.build()
				.apiInfo(apiInfo());
	}


}
