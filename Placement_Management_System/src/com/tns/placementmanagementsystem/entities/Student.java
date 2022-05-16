package com.tns.placementmanagementsystem.entities;

import java.io.Serializable;
import javax.persistence.*;




@Entity
@Table(name="student")

public class Student implements Serializable{
	
	// Defining serializale_id 
		private static final long serialVersionUID = 1L;
		
		//Declaring private instance variable
		
		// With Id annotation we are indicating that this is a primary key field
		
		@Id
		@Column(name="id")
		private int id;
		
		@Column(name="name")
		private String name;
		
		
		@Column(name="college_id")
		private String college;
		
		@Column(name="roll")
		private int roll;
		
		@Column(name="qualification")
		private String qualification;
		
		@Column(name="course")
		private String course;
		
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="certificate_id")
		private Certificate certificate;
		
		@Column(name="hallTicketNo")
		private int hallTicketNo;
		
		@Column(name="year")
		private int year;
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		

		public String getCollege() {
			return college;
		}

		public void setCollege(String college) {
			this.college = college;
		}

		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		

		public Certificate getCertificate() {
			return certificate;
		}

		public void setCertificate(Certificate certificate) {
			this.certificate = certificate;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getHallTicketNo() {
			return hallTicketNo;
		}

		public void setHallTicketNo(int hallTicketNo) {
			this.hallTicketNo = hallTicketNo;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

	
		

		
		
		
		
		

}