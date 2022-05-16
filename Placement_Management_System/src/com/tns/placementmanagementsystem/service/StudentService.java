package com.tns.placementmanagementsystem.service;

import com.tns.placementmanagementsystem.entities.Student;
import com.tns.placementmanagementsystem.entities.Certificate;


public interface StudentService {
	
	public abstract void addStudent(Student student);
	
	public abstract void  updateStudent(Student student); 
	
	public Student searchStudentById(int id);  

	public Student searchStudentByHallTicket(int hallTicketNo);
	
	public Certificate addCertificate(Certificate certificate);

	public Certificate updateCertificate(Certificate certificate);
	
	public Student  deleteStudent(Student student); 


}
