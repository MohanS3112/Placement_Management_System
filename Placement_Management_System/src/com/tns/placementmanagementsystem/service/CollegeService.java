package com.tns.placementmanagementsystem.service;

import com.tns.placementmanagementsystem.entities.College;

/*+addCollege(College college) : College
+updateCollege(College college) : College
+searchCollege(long id): College
+deleteCollege(long id):Boolean
+schedulePlacement(Placement placement): boolean
*/
public interface CollegeService {

	public abstract void addCollege(College college);

	public abstract void updateCollege(College college);

	public abstract void deleteCollege(int id);
	
	public abstract College findCollegeById(int id);

	//public abstract Boolean schedulePlacement(Placement placement);
}
