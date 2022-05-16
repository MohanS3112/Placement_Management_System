package com.tns.placementmanagementsystem.service;

import com.tns.placementmanagementsystem.dao.StudentDao;
import com.tns.placementmanagementsystem.dao.StudentDaoImpl;
import com.tns.placementmanagementsystem.entities.Certificate;
import com.tns.placementmanagementsystem.entities.Student;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao dao;

	// Initializing StudentRepositoryImp class object
	public StudentServiceImpl() 
	{
		dao = new StudentDaoImpl();
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public Student searchStudentById(int id) {
		Student student = dao.searchStudentById(id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(int hallTicketNo) {
		Student student = dao.searchStudentByHallTicket(hallTicketNo);
		return student;
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
		
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	
	}

	@Override
	public Student deleteStudent(Student student) {
		dao.beginTransaction();
		dao.deleteStudent(student);
		dao.commitTransaction();
		return student;
	}
	
}
