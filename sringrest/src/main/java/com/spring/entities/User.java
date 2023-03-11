package com.spring.entities;

public class User {

	private String name;
	private char gender;
	private int age;
	private long id;

	//List<BookingDetails> myRides;
	
	public User(String name, char gender, int age, long id) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
	}

	public User() {
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

	@Override
	public String toString() {
		return "Users [name=" + name + ", gender=" + gender + ", age=" + age + ", id=" + id + "]";
	}
	
}
