package com.tns.placementmanagementsystem.dao;

import javax.persistence.EntityManager;


import com.tns.placementmanagementsystem.entities.User;

public class UserDaoImpl implements UserDao{
	
private EntityManager entityManager;
	
	public UserDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}


	@Override
	public void addUser(User user) {
		entityManager.persist(user);
		
	}

	@Override
	public void updateUser(User user) {
		entityManager.merge(user);
		
	}
	
	@Override
	public void deleteUser(int id) {
		User user = findUserById(id);
		entityManager.remove(user);
	}
	
	@Override
	public User findUserById(int id) {
		User user = entityManager.find(User.class, id);
		return user;
	}


	@Override
	public void beginTrancsaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
	

}