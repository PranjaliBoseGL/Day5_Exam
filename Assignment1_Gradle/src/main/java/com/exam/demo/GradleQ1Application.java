/*1)Develop an application using SpringBoot with RestFull Web Services(CRUD Operations) using Gradle configuration.*/


package com.exam.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleQ1Application {

	public static void main(String[] args) {
		SpringApplication.run(GradleQ1Application.class, args);
		System.out.println("Server Started");
	}

}
