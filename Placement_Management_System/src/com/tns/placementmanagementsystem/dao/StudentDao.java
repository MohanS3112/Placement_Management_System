package com.tns.placementmanagementsystem.dao;

import com.tns.placementmanagementsystem.entities.Certificate;
import com.tns.placementmanagementsystem.entities.Student;

//Defining a interface IStudentRepository

public interface StudentDao {
	
	// Declaring abstract methods
	
		public Student addStudent(Student student);
		
		public Student updateStudent(Student student);
		
		public Student searchStudentById(int id);
		
		public Student searchStudentByHallTicket(int hallticketNo);
		
		public Student deleteStudent(Student student);
		
		public Certificate addCertificate(Certificate certificate);
		
		public Certificate updateCertificate(Certificate certificate);
		
		
		public abstract void beginTransaction();
		
		public abstract void commitTransaction();

}
