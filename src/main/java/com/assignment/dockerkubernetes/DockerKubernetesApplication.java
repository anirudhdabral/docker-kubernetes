package com.assignment.dockerkubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerKubernetesApplication {

	@GetMapping("/")
	public String home(){
		return "Welcome to home - Docker & Kubernetes assignment";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerKubernetesApplication.class, args);
	}

}
