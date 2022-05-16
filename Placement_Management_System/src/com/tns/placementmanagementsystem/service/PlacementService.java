package com.tns.placementmanagementsystem.service;

import com.tns.placementmanagementsystem.entities.Placement;

public interface PlacementService {

    public abstract void addPlacement(Placement placement);
	
	public abstract void updatePlacement(Placement placement);
	
	public abstract Placement searchPlacementById(int id);
	
	
}
