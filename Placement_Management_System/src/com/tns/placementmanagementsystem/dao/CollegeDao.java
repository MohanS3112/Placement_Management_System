package com.tns.placementmanagementsystem.dao;


import com.tns.placementmanagementsystem.entities.College;

public interface CollegeDao {

	public abstract College findCollegeById(int id);

	public abstract void addCollege(College college);

	public abstract void updateCollege(College college);

	public abstract void deleteCollege(int id);

	void beginTransaction();

	void commitTransaction();

}
