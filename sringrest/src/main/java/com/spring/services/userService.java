package com.spring.services;

import java.util.List;

import com.spring.entities.User;

public interface userService {
	
	public List<User> getUsers();
	
	public User getUsers(long id);
	
	public User addUser(User user);
	
	public void updateUser(User user, long id);
	
	public void deleteUser(long id);
}
