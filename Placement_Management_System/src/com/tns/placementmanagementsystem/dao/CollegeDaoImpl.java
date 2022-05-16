package com.tns.placementmanagementsystem.dao;


import javax.persistence.EntityManager;


import com.tns.placementmanagementsystem.entities.College;

/*+addCollege(College college) : College
+updateCollege(College college) : College
+searchCollege(long id): College
+deleteCollege(long id):Boolean
*/

public class CollegeDaoImpl implements CollegeDao {
	private EntityManager entityManager;

	public CollegeDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addCollege(College college) {
		// for insertion persist();
		entityManager.persist(college);
	}

	@Override
	public void updateCollege(College college) {
		// for update operation
		entityManager.merge(college);
	}


	@Override
	public void deleteCollege(int id) {
		// for delete operation
		College college = findCollegeById(id);
		entityManager.remove(college);
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public College findCollegeById(int id) {
		College collegefind = entityManager.find(College.class, id);
		return collegefind;
	}

	
}