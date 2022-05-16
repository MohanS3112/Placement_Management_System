package com.tns.placementmanagementsystem.service;

import com.tns.placementmanagementsystem.entities.Certificate;
import com.tns.placementmanagementsystem.dao.CertificateDaoImpl;
import com.tns.placementmanagementsystem.dao.CertificateDao;


public class CertificateServiceImpl implements CertificateService{
	
	
	private CertificateDao dao;
	
	public CertificateServiceImpl() {
		
		dao = new CertificateDaoImpl();
	}

	@Override
	public void addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		
		
	}

	@Override
	public void updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		
	}

	@Override
	public Certificate searchCertificateById(int id) {
		Certificate certificate = dao.searchCertificateById(id);
		return certificate;
	}

	@Override
	public void deleteCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.deleteCertificate(certificate);
		dao.commitTransaction();
		
	}

}
