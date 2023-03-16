package com.atsistemas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

import com.atsistemas.hints.WorkshopNativeHints;


@SpringBootApplication
@ImportRuntimeHints(WorkshopNativeHints.class)
public class WorkshopNativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopNativeApplication.class, args);
	}

}
