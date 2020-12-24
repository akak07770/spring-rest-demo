package com.example.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/entity")
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}

	@GetMapping
	public Entity getEntity(){
		return new Entity(1, "val");
	}

	@PostMapping
	public void postEntity(@RequestBody Entity entity){
		System.out.println(entity);
	}
}
