package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.violation;
import com.example.demo.repo.violationRepo;



@Service
public class violationService {
	
	 @Autowired
	    private violationRepo repo;

	    public violation addviolation(violation s) {
	        return repo.save(s);
	    }
	    
	    public List<violation> getall(){
			return (List<violation>) repo.findAll();
		}

}
