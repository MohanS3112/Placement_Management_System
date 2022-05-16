package com.tns.placementmanagementsystem.service;



import com.tns.placementmanagementsystem.dao.CollegeDao;
import com.tns.placementmanagementsystem.dao.CollegeDaoImpl;
import com.tns.placementmanagementsystem.entities.College;

public class CollegeServiceImpl implements CollegeService {

	private CollegeDao dao;

	public CollegeServiceImpl() {
		dao = new CollegeDaoImpl();
	}

	@Override
	public void addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
	}

	@Override
	public void updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
	}

	

	@Override
	public void deleteCollege(int id) {
		dao.beginTransaction();
		dao.deleteCollege(id);
		dao.commitTransaction();
	}

	@Override
	public College findCollegeById(int id) {
		return dao.findCollegeById(id);
	}

	

}
