package com.roshini.demoProject.myFirstApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = {"com.roshini.demoProject.myFirstApp","com.roshini.demoProject.util"})
@SpringBootApplication
public class MyFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstAppApplication.class, args);
		System.out.println("Hello World");
	}

}
