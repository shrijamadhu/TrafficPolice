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
public class violation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String violatorname;
	private String violationtype;
	private String vechi1etype;
	private String vechi1eregnum;
	private String vechi1ecolor;
	private String ownedby;
	private String currentdate;
	private String location;

}
