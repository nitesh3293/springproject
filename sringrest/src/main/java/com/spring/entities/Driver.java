package com.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
	
	private long id;
	private String name;
	private char gender;
	private int age;
	private String vehicle;
	private String model;
	Location currentLocation;
	private int status;
	


}
