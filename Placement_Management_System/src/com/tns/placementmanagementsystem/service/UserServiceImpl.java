package com.tns.placementmanagementsystem.service;

import com.tns.placementmanagementsystem.entities.User;
import com.tns.placementmanagementsystem.dao.UserDaoImpl;
import com.tns.placementmanagementsystem.dao.UserDao;

public class UserServiceImpl implements UserService{
	
	
private UserDao dao;
	
	public UserServiceImpl() {
		dao = new UserDaoImpl();
	}

	@Override
	public void addUser(User user) {
		dao.beginTrancsaction();
		dao.addUser(user);
		dao.commitTransaction();
		
	}

	@Override
	public void updateUser(User user) {
		dao.beginTrancsaction();
		dao.updateUser(user);
		dao.commitTransaction();
		
	}
	
	@Override
	public User findUserById(int id) {
		User user = dao.findUserById(id);
		return user;
	}
	
	

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logOut() {
		
		System.out.println("Logout.....");
	}

	@Override
	public void deleteUser(int id) {
		dao.beginTrancsaction();
		dao.deleteUser(id);
		dao.commitTransaction();
	}

}