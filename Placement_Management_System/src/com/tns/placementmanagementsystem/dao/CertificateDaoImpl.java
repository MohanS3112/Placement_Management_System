package com.tns.placementmanagementsystem.dao;

import javax.persistence.EntityManager;
import com.tns.placementmanagementsystem.entities.Certificate;

public class CertificateDaoImpl implements CertificateDao {
	
	private EntityManager entityManager;
	
	public CertificateDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		
	}

	@Override
	public void updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
	}

	@Override
	public Certificate searchCertificateById(int id) {
		Certificate certificate = entityManager.find(Certificate.class, id);
		return certificate;
		
	}

	@Override
	public void deleteCertificate(Certificate certificate) {
		entityManager.remove(certificate);
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	

}