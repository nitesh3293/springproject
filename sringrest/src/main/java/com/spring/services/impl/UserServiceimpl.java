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

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepo.getUsers();
	}

	@Override
	public User getUsers(long id) {
		// TODO Auto-generated method stub
			return userRepo.getUsers(id);
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.addUser(user);
	}

	@Override
	public void updateUser(User user, long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
	}

	

}
