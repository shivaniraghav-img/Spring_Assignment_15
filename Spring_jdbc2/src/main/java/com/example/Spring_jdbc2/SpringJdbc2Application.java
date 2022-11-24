package com.example.Spring_jdbc2;

import javax.annotation.PostConstruct;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringJdbc2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbc2Application.class, args);
	}
   @PostConstruct
   public void executeMe()
   {
	   System.out.println("I will execute first");
   }
}
