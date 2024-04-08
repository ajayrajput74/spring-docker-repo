package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "docker")
public class DockerDemoController {

	@GetMapping(value = "value")
	public String getData() {
      return "Docker Image Runing with changes";
	}
	
	
	

}
