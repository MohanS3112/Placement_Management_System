package com.tns.placementmanagementsystem.client;



import com.tns.placementmanagementsystem.entities.Certificate;
import com.tns.placementmanagementsystem.service.*;
import com.tns.placementmanagementsystem.entities.Student;
import com.tns.placementmanagementsystem.entities.User;
import com.tns.placementmanagementsystem.entities.College;
import com.tns.placementmanagementsystem.entities.Placement;

public class RetrieveClient {
	
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
		
													///RETRIEVE OPERATION///
		
													 //for STUDENT MODULE//
		
		student = Sservice.searchStudentById(00001);
		System.out.println("ID: "+student.getId());
		System.out.println("Name: "+student.getName());
		
		
													
		
													//for PLACEMENT MODULE//
		
		placement = Pservice.searchPlacementById(00001);
		System.out.println("ID: "+placement.getId());
		System.out.println("Name"+placement.getName());
		System.out.println("Name"+placement.getCollege());
		
		
													//for CERTIFICATE MODULE//
		
		certificate = Cservice.searchCertificateById(00001);
		System.out.println("ID: "+certificate.getId());
		System.out.println("College: "+certificate.getCollege());
		
		
													//for COLLEGE  MODULE//
		
		college = COservice.findCollegeById(00001);
		System.out.println("ID: "+college.getCollegeName());
		System.out.println("Name: "+college.getCollegeAdmin());
		System.out.println("Location: "+college.getLocation());
		
		
		
													//for USER MODULE//
		
		user = Uservice.findUserById(0001);
		System.out.println("Name: "+user.getName());
		System.out.println("Type"+user.getType());
	}


}
