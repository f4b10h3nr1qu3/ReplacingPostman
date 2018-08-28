package com.f4b10h3nr1qu3.ecm.test.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;

import io.restassured.RestAssured;

/**
 * ReferenceList Configuration to run Unit Tests and Integration Tests.
 */
@Configuration
@ComponentScan
@ContextConfiguration
@PropertySource("classpath:test.properties")
public class ECMTestConfiguration {

	@Value("${restAssured.port}")
	private int port;

	@Value("${restAssured.baseURI}")
	private String baseURI;

	@Value("${restAssured.basePath}")
	private String basePath;

	@PostConstruct
	public void init() {

		RestAssured.port = port;
		RestAssured.baseURI = baseURI;
		RestAssured.basePath = basePath;

	}

	public static void main(String[] args) {
		SpringApplication.run(ECMTestConfiguration.class, args);
	}

}
