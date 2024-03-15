package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Emergency;
import com.example.demo.repo.EmergrncyRepo;

@Service
public class emergencyService {
	@Autowired
	private EmergrncyRepo repo;

	public Emergency addEmergency(Emergency s) {
		return repo.save(s);
	}

	public List<Emergency> getall() {
		return (List<Emergency>) repo.findAll();
	}

}
