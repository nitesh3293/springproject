package com.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


import com.spring.entities.Users;

@Service
public class UserServiceimpl implements userService {
	
	List<Users> userList;
	
	public UserServiceimpl() {
		userList = new ArrayList<>();
	}

	@Override
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return userList;
	}

	@Override
	public Users getUsers(long id) {
		// TODO Auto-generated method stub
		Users u = null;
		
		for(Users user : userList)
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
	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		userList.add(user);
		return user;
	}

	@Override
	public void updateUser(Users user, long id) {
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
