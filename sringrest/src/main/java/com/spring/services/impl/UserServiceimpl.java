package com.spring.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.spring.repo.UserRepo;
import com.spring.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.entities.User;

@Service
public class UserServiceimpl implements userService {
	
	@Autowired
	private UserRepo userRepo;

	//Show all Users
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepo.getUsers();
	}

	//Show a User
	@Override
	public User getUsers(long id) {
		// TODO Auto-generated method stub
			return userRepo.getUsers(id);
	}

	//Add a User
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.addUser(user);
	}

	//Update User
	@Override
	public void updateUser(User user, long id) {
		// TODO Auto-generated method stub
	}

	//Delete User
	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
	}

	

}
