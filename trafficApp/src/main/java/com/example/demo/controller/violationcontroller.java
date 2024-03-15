package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.violation;
import com.example.demo.service.violationService;

@RestController
@RequestMapping("/api/v1")
public class violationcontroller {

	@Autowired
	private violationService violationService;

	@PostMapping("/addviolation")
	public violation addviolation(@RequestBody violation s) {
		return violationService.addviolation(s);
	}
	
	@GetMapping("/violationData")
	public List<violation>getall(){
		return violationService.getall();
	}

}
