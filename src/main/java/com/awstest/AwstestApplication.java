package com.awstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@PropertySource("classpath:/aws.properties")
public class AwstestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwstestApplication.class, args);
	}

}
