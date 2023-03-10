package com.spring.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.spring.services.userService;
import org.springframework.stereotype.Service;


import com.spring.entities.User;

@Service
public class UserServiceimpl implements userService {
	
	List<User> userList;
	
	public UserServiceimpl() {
		userList = new ArrayList<>();
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userList;
	}

	@Override
	public User getUsers(long id) {
		// TODO Auto-generated method stub
		User u = null;
		
		for(User user : userList)
		{
			if(user.getId() == id)
			{
				u = user;
				break;
			}
		}
		return u;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		userList.add(user);
		return user;
	}

	@Override
	public void updateUser(User user, long id) {
		// TODO Auto-generated method stub
		
		userList = userList.stream().map(u ->{
			if(u.getId() == id)
			{
				u.setAge(user.getAge());
				u.setGender(user.getGender());
				u.setName(user.getName());
			}
			return u;
		}).collect(Collectors.toList());
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		
		userList = userList.stream().filter(x -> x.getId() != id).collect(Collectors.toList());
	}

	

}
