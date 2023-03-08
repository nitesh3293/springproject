package com.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.Users;
import com.spring.services.userService;

@RestController
public class MyController {
	
	@Autowired
	private userService userServe;
	
	 
	
	//getUserInformation
	@GetMapping("/users")
	public List<Users> getUsers()
	{
		return this.userServe.getUsers();
	}
	
	//getDriverInformation
	
	
	//@GetMapping("/drivers")
	/*public List<Drivers> getDrivers()
	{
		return this.driverServe.getDrivers();
	}
	*/
	
	//getSpecificUserInformation
	@GetMapping("/users/{id}")
	public Users getUsers(@PathVariable long id)
	{
		return this.userServe.getUsers(id);
	}
	
	//postUsersInformation
	@PostMapping("/users")
	public Users addUser(@RequestBody Users user) 
	{
		return this.userServe.addUser(user);
	}
	
	
	//UpdateUserInformation
	@PutMapping("/users/{id}")
	public Users updateUser(@RequestBody Users user, @PathVariable long id)
	{
		 this.userServe.updateUser(user,id);
		 return user; 
	}
	
	//Delete User Information
	//@DeleteMapping
	
}
