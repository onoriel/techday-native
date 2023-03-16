package com.atsistemas.config;


import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;


/**
 * OpenApi Configuration
 * @author onmunoz
 *
 */
@Configuration
public class AppSwaggerConfig {
	@Bean
	  public GroupedOpenApi publicApi() {
	      return GroupedOpenApi.builder()
	    		  .displayName("Alerts")
	              .group("com.onoriel.native")
	              .pathsToMatch("/services/**")
	              .build();
	  }
	 @Bean
	  public OpenAPI springShopOpenAPI() {
		 Contact contact = new Contact();
		 contact.setEmail("info@onoriel.es");
		 contact.setName("ONORIEL");
		 contact.setUrl("https://www.onoriel.com");
		 
	      return new OpenAPI()
	              .info(new Info().title("REST Api Application - Alerts")
	              .description("Documentation REST API")
	              .version("Version 1.0.0")
	              .contact(contact)
	              .license(new License().name("License of Api for General use")))
	              .externalDocs(new ExternalDocumentation()
	              .description("Terms of service base into company terms of use"));
	  }
}
