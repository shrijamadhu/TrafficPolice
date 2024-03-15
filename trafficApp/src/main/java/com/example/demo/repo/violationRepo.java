package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.violation;

public interface violationRepo extends JpaRepository<violation, Integer>{

}
