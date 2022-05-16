package com.tns.placementmanagementsystem.service;

import com.tns.placementmanagementsystem.entities.Certificate;

public interface CertificateService {
	
	public abstract void addCertificate(Certificate certificate);
	
	public abstract void updateCertificate(Certificate certificate);
	
	public abstract Certificate searchCertificateById(int id);
	
	public abstract void deleteCertificate(Certificate certificate);

}
