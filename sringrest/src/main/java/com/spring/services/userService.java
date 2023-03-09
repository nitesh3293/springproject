package com.spring.services;

import java.util.List;

import com.spring.entities.Users;

public interface userService {
	
	public List<Users> getUsers();
	
	public Users getUsers(long id);
	
	public Users addUser(Users user);
	
	public void updateUser(Users user, long id);
	
	public void deleteUser(long id);
}
