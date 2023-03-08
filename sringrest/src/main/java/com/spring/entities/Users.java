package com.spring.entities;

public class Users {

	private String name;
	private char gender;
	private int age;
	private long id;
	
	public Users(String name, char gender, int age, long id) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
	}

	public Users() {
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
