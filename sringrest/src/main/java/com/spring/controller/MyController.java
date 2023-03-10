package com.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.User;
import com.spring.services.userService;

@RestController
public class MyController {
	
	@Autowired
	private userService userServe;
	
	 
	
	//getUserInformation
	@GetMapping("/users")
	public List<User> getUsers()
	{
		return this.userServe.getUsers();
	}
		
	//getSpecificUserInformation
	@GetMapping("/users/{id}")
	public User getUsers(@PathVariable("id") long id)
	{
		return this.userServe.getUsers(id);
	}
	
	//postUsersInformation
	@PostMapping("/users")
	public User addUser(@RequestBody User user)
	{
		return this.userServe.addUser(user);
	}
	
	
	//UpdateUserInformation
	@PutMapping("/users/{id}")
	public User updateUser(@RequestBody User user, @PathVariable("id") long id)
	{
		 this.userServe.updateUser(user,id);
		 return user; 
	}
	
	//Delete User Information
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable("id") long id)
	{
		this.userServe.deleteUser(id);
	}
	
}
