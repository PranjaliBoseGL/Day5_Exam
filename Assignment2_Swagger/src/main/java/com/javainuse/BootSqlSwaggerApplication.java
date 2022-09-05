/*2)write a program to describe Swagger API documentation.
  (hint: try to use GET,POST,PUT,DELTE)*/


package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootSqlSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSqlSwaggerApplication.class, args);
		System.out.println("Server Started");
	}

}


//for running on browser
//http://localhost:8080/swagger-ui.html