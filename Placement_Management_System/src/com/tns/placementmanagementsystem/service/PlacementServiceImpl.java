package com.tns.placementmanagementsystem.service;

import com.tns.placementmanagementsystem.entities.Placement;
import com.tns.placementmanagementsystem.dao.PlacementDao;
import com.tns.placementmanagementsystem.dao.PlacementDaoImpl;

public class PlacementServiceImpl implements PlacementService{

    private PlacementDao dao;
	
	public PlacementServiceImpl() {
		dao = new PlacementDaoImpl();
		
	}

	@Override
	public void addPlacement(Placement placement) {
		dao.beginTrancsaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
	}

	@Override
	public void updatePlacement(Placement placement) {
		dao.beginTrancsaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		
	}

	@Override
	public Placement searchPlacementById(int id) {
		Placement placement = dao.searchPlacementById(id);
		return placement;
	}
		
}