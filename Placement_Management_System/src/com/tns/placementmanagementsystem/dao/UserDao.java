package com.tns.placementmanagementsystem.dao;

import com.tns.placementmanagementsystem.entities.User;


//Defining a interface IUserRepository
public interface UserDao {
	
	// Declaring abstract methods
		public void addUser(User user);
		
		public void updateUser(User user);
		
		public void deleteUser(int id);
		
		public User findUserById(int id);
		
		public void beginTrancsaction();
		
		public void commitTransaction();
	
	

}