package com.tns.placementmanagementsystem.dao;
import javax.persistence.EntityManager;

import com.tns.placementmanagementsystem.entities.Placement;



public class PlacementDaoImpl implements PlacementDao {
	
	private EntityManager entityManager;

	public PlacementDaoImpl() {
		
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public void addPlacement(Placement placement) {
	
		entityManager.persist(placement);
	}

	@Override
	public void updatePlacement(Placement placement) {
		
		entityManager.merge(placement);
		
	}
	
	
	@Override
	public void beginTrancsaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public Placement searchPlacementById(int id) {
		Placement placement = entityManager.find(Placement.class, id);
		return placement;
	}

	
	
}
