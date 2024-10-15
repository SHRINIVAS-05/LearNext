package com.LearnNext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class LearnNextApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnNextApplication.class, args);
		System.out.println("Hello");
		System.out.println("Starting of the application");
		
		//<td th:text="${Lesson.links}"></td> 
	}

}	

