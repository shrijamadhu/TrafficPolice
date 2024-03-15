package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Emergency {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String location;
	private String emergencytype;
	private String effectedcount;
	private String priority;

}