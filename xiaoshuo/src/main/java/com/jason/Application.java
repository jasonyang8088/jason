package com.jason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication springApplication =new SpringApplication(Application.class);
		springApplication.addListeners(new ApplicationStartup());
		springApplication.run(args);
	}

}
