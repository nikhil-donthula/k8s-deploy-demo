package com.nikhildonthula.k8sdeploydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sDeployDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sDeployDemoApplication.class, args);
	}

	@GetMapping("/") //change sub path "/" to stg else("/nikhil") if you want to change microservice endpoint
	String demo(){
		return "hello this is demo Spring micro service";
	}

}
