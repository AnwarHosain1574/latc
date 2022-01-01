package com.example.LATC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LatcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LatcApplication.class, args);
		System.out.println("Server Running");
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
      return new RestTemplate();
	}

}
