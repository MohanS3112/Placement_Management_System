package com.tns.placementmanagementsystem.dao;


import com.tns.placementmanagementsystem.entities.Placement;

public interface PlacementDao {

	public abstract void addPlacement(Placement placement);
	
	public abstract void updatePlacement(Placement placement);
	
	public abstract Placement searchPlacementById(int id);

	public abstract void beginTrancsaction();

	public abstract void commitTransaction();
}