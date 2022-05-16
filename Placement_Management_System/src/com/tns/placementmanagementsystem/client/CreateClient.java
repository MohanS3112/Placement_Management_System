package com.tns.placementmanagementsystem.client;



import com.tns.placementmanagementsystem.entities.Certificate;
import com.tns.placementmanagementsystem.service.*;
import com.tns.placementmanagementsystem.entities.Student;
import com.tns.placementmanagementsystem.entities.User;
import com.tns.placementmanagementsystem.entities.College;
import com.tns.placementmanagementsystem.entities.Placement;

public class CreateClient {

	public static void main(String[] args) {
		
		
		StudentService Sservice = new StudentServiceImpl();
		PlacementService Pservice = new PlacementServiceImpl();
		CertificateService Cservice = new CertificateServiceImpl();
		CollegeService COservice = new CollegeServiceImpl();
		UserService Uservice = new UserServiceImpl();
		
		Student student = new Student();
		Placement placement = new Placement();
		Certificate certificate = new Certificate();
		College college = new College();
		User user = new User();
		
		
													///CREATE OPERATIONS///
		
													 //for STUDENT MODULE//
		
		student.setId(00001);
		student.setCourse("JFS");
		student.setHallTicketNo(50404);
		student.setCollege("Saket");
		student.setName("Adam Gilchrist");
		student.setQualification("BE");
		student.setRoll(1);
		student.setYear(2022);
		Sservice.addStudent(student);
		
		System.out.println("Record added successfully......");
		
		
													// for COLLEGE MODULE//
		
		
		college.setCollegeAdmin("Principal");
		college.setCollegeName("Ideal");
		college.setLocation("Kalyan");
		college.setId(21);
		college.setuId(user);
		COservice.addCollege(college);
		
		
													// for CERTIFICATE MODULE//
		
		
		/*certificate.setCollege(college);
		certificate.setId(0);
		certificate.setYear(2022);
		Cservice.addCertificate(certificate);
		
		
													// for PLACEMENT MODULE//
		
		
		placement.setCollege(college);
		placement.setDate("05-05-2022");
		placement.setName("Adam Gilchrist");
		placement.setQualification("BE");
		placement.setYear(2022);
		placement.setId(000001);
		Pservice.addPlacement(placement);
		
		
		
													// for USER MODULE//
		
		user.setId(0);
		user.setName("Adam Gilchrist");
		user.setType("Student");
		Uservice.addUser(user);*/
		
		
	System.out.println("Task Ended........");
		
		

	}

}
