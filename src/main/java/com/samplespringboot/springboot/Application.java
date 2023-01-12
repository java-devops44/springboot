package com.samplespringboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController


public class Application {

	@GetMapping("/welcome")
	public string welcome(){
		return "welcome to javatech"
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
