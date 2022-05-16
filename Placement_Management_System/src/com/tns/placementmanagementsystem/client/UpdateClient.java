package com.tns.placementmanagementsystem.client;



import com.tns.placementmanagementsystem.entities.Certificate;
import com.tns.placementmanagementsystem.entities.Student;
import com.tns.placementmanagementsystem.entities.User;
import com.tns.placementmanagementsystem.service.CertificateService;
import com.tns.placementmanagementsystem.service.CertificateServiceImpl;
import com.tns.placementmanagementsystem.service.CollegeService;
import com.tns.placementmanagementsystem.service.CollegeServiceImpl;
import com.tns.placementmanagementsystem.service.PlacementService;
import com.tns.placementmanagementsystem.service.PlacementServiceImpl;
import com.tns.placementmanagementsystem.service.StudentService;
import com.tns.placementmanagementsystem.service.StudentServiceImpl;
import com.tns.placementmanagementsystem.service.UserService;
import com.tns.placementmanagementsystem.service.UserServiceImpl;
import com.tns.placementmanagementsystem.entities.College;
import com.tns.placementmanagementsystem.entities.Placement;

public class UpdateClient {

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
		
		
															///UPDATE OPERATION///
		
															//for STUDENT MODULE//
		
		student = Sservice.searchStudentById(00001);
		student.setName("Johnny Depp");
		Sservice.updateStudent(student);
		
		// at this breakpoint we have updated record added in first session
		
		student = Sservice.searchStudentById(00001);
		System.out.println("ID: "+student.getId());
		System.out.println("Name: "+student.getName());
		
		
														//for PLACEMENT MODULE//
		
		placement = Pservice.searchPlacementById(00001);
		placement.setName("Johnny Depp");
		Pservice.updatePlacement(placement);
		
		
		// at this breakpoint we have updated record added in first session
		
		
		placement = Pservice.searchPlacementById(00001);
		System.out.println("ID: "+placement.getId());
		System.out.println("Name"+placement.getName());
		System.out.println("Name"+placement.getCollege());
		
		
		
														// for CERTIFICATE MODULE//
		
		certificate = Cservice.searchCertificateById(0001);
		certificate.setCollege(college);
		certificate.setYear(2023);
		
		// at this breakpoint we have updated record added in first session
		
		certificate = Cservice.searchCertificateById(00001);
		System.out.println("College: "+certificate.getCollege());
		System.out.println("College: "+certificate.getCollege());
		
		
														//for COLLEGE MODULE//
		
		college = COservice.findCollegeById(00001);
		college.setCollegeAdmin("Bheemla");
		college.setCollegeName("Mumbai University");
		college.setLocation("Mumbai");
		
		// at this breakpoint we have updated record added in first session
		
		college = COservice.findCollegeById(00001);
		System.out.println("ID: "+college.getCollegeName());
		System.out.println("Name: "+college.getCollegeAdmin());
		System.out.println("Location: "+college.getLocation());
		
		
														//for USER MODULE//
		
		user = Uservice.findUserById(00001);
		user.setName("Nayak");
		user.setType("Student");
		
		// at this breakpoint we have updated record added in first session
		
		user = Uservice.findUserById(0001);
		System.out.println("Name: "+user.getName());
		System.out.println("Type"+user.getType());
		
		
		

	}

}
