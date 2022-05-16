package com.tns.placementmanagementsystem.dao;

import com.tns.placementmanagementsystem.entities.Certificate;

public interface CertificateDao {
	
	public abstract void addCertificate(Certificate certificate);
	
	public abstract void updateCertificate(Certificate certificate);
	
	public abstract Certificate searchCertificateById(int id);
	
	public abstract void deleteCertificate(Certificate certificate);
	
	public abstract void commitTransaction();
	
	public abstract void beginTransaction();

}
