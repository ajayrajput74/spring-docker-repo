package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "docker")
public class DockerDemoController {

	@GetMapping(value = "value")
	public MyObject getData() {
		
		MyObject data = new MyObject();
		data.setAge(26);
		data.setCity("Indore");
		data.setName("Ajay Rajput");
      return data;
	}
	
}
