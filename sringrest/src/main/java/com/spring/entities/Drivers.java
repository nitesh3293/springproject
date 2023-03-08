package com.spring.entities;

public class Drivers {
	
	private String name;
	private char gender;
	private int age;
	private long id;
	private String vehicle;
	private String model;
	
	
	public Drivers(String name, char gender, int age, long id, String vehicle, String model) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
		this.vehicle = vehicle;
		this.model = model;
	}


	public Drivers() {
		super();
		// TODO Auto-generated constructor stub
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


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "Drivers [name=" + name + ", gender=" + gender + ", age=" + age + ", id=" + id + ", vehicle=" + vehicle
				+ ", model=" + model + "]";
	}
	
	
	

}
