package com.example.spring_boot_demo_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDemoGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoGitApplication.class, args);
	}
	
	@GetMapping //Modify dev2 changes
	String getMessage() {
		return "Hello World";
	}

}
