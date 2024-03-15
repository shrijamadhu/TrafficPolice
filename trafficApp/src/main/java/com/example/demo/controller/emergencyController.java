package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Emergency;
import com.example.demo.service.emergencyService;

@RestController
@RequestMapping("/api/v1")
public class emergencyController {
	
	
	@Autowired
	private emergencyService emergencyService;

	@PostMapping("/addEmergency")
	public Emergency addviolation(@RequestBody Emergency s) {
		return emergencyService.addEmergency(s);
	}

	@GetMapping("/EmergencyData")
	public List<Emergency> getall() {
		return emergencyService.getall();
	}

}
