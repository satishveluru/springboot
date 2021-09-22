package com.satti.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker")
public class BootController {

	@GetMapping
	public String sayHello() {
		return "Spring Boot Controller Saying Hello .";

	}
}
