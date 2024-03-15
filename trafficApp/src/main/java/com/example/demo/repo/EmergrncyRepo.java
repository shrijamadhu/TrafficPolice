package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Emergency;

public interface EmergrncyRepo extends JpaRepository<Emergency, Integer>{

}
