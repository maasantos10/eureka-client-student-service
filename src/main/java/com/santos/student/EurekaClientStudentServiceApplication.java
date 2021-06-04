package com.santos.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientStudentServiceApplication.class, args);
	}

}
