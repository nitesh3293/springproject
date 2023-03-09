package com.spring.entities;

import java.util.Arrays;

public class Drivers {
	
	private long id;
	private String name;
	private char gender;
	private int age;
	private String vehicle;
	private String model;
	private int[] location;
	private boolean status;
	
	public Drivers(long id, String name, char gender, int age, String vehicle, String model, int[] location,
			boolean status) {
		super();
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.vehicle = vehicle;
		this.model = model;
		this.location = location;
		this.status = status;
	}
	
	public Drivers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int[] getLocation() {
		return location;
	}
	
	public void setLocation(int[] location) {
		this.location = location;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "Drivers [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", vehicle=" + vehicle
				+ ", model=" + model + ", location=" + Arrays.toString(location) + ", status=" + status + "]";
	}
	
	
	

}
