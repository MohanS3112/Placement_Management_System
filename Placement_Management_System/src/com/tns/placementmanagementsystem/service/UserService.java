package com.tns.placementmanagementsystem.service;

import com.tns.placementmanagementsystem.entities.User;

public interface UserService {
	
public void addUser(User user);
	
	public User findUserById(int id);
	
	public void updateUser(User user);
	
	public void deleteUser(int id);
	
	
	public void login();
	
	public void logOut();

}
