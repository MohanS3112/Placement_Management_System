package com.tns.placementmanagementsystem.dao;

//Importing required entity class and interfaces 
import javax.persistence.EntityManager;

import com.tns.placementmanagementsystem.entities.Certificate;
import com.tns.placementmanagementsystem.entities.Student;

public class StudentDaoImpl implements StudentDao {
	
	// Declaring the EntityManager instance variable
		private EntityManager entityManager;
		
		public StudentDaoImpl() 
		{
			entityManager = JPAUtil.getEntityManager();
		}

		
		//Create Operation
		@Override
		public Student addStudent(Student student) {
			entityManager.persist(student);
			return student;
		}

		@Override
		public Student updateStudent(Student student) {
			entityManager.merge(student);
			return student;
		}

		@Override
		public Student searchStudentById(int id) {
			Student student = entityManager.find(Student.class, id);
			return student;
		}

		@Override
		public Student searchStudentByHallTicket(int hallTicketNo) {
			Student student = entityManager.find(Student.class, hallTicketNo);
			return student;
		}

		@Override
		public Student deleteStudent(Student student) {
			entityManager.remove(student);
			return student;
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
		public Certificate addCertificate(Certificate certificate) {
			entityManager.persist(certificate);
			return certificate;
		}


		@Override
		public Certificate updateCertificate(Certificate certificate) {
			entityManager.merge(certificate);
			return certificate;
		}

}

