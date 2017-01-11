package com.crystianemeira.digitallibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DigitalLibraryApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DigitalLibraryApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello!";
	}
}
