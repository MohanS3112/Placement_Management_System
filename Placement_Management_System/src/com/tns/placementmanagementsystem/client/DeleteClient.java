package com.tns.placementmanagementsystem.client;




import com.tns.placementmanagementsystem.entities.Certificate;
import com.tns.placementmanagementsystem.service.*;
import com.tns.placementmanagementsystem.entities.Student;
//import com.tns.placementmanagementsystem.entities.User;
//import com.tns.placementmanagementsystem.entities.College;
//import com.tns.placementmanagementsystem.entities.Placement;

public class DeleteClient {

	public static void main(String[] args) {
		StudentService Sservice = new StudentServiceImpl();
		//PlacementService Pservice = new PlacementServiceImpl();
		CertificateService Cservice = new CertificateServiceImpl();
		//CollegeService COservice = new CollegeServiceImpl();
		//UserService Uservice = new UserServiceImpl();
		
		Student student = new Student();
		//Placement placement = new Placement();
		Certificate certificate = new Certificate();
		//College college = new College();
		//User user = new User();
		
		
															///DELETE OPERATION///
															
															 //for STUDENT MODULE//
		
		
		student = Sservice.searchStudentById(00001);
		Sservice.deleteStudent(student);
		
		
		
															//for CERTIFICATE MODULE//
		
		certificate = Cservice.searchCertificateById(00001);
		Cservice.deleteCertificate(certificate);
		
		
															//for COLLEGE MODULE//
		
		/*college = COservice.findCollegeById(00001);
		COservice.deleteCollege(college);
		
		
		
		
															//for USER MODULE//
		
		user = Uservice.findUserById(00001);
		Uservice.deleteUser(0);*/
		
		
		
		

	}

}
