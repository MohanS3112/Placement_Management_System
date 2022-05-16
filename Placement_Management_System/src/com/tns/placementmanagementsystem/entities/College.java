package com.tns.placementmanagementsystem.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="college")
//@NamedQueries(@NamedQuery(name = "searchCollege", query = "find(College.class, id)"))


public class College implements Serializable {
	// after implementing Serializable,
	// for communication to take place in the form
	// of byte stream,
	// we have to provide some serial number or identifier.
	private static final long serialVersionUID = 1L;
	
	// Column annotation we are indicating the actual name of column of relational world.
	
	@Id
	@Column(name="college_id")
	private int id;
	
	@Column(name="collegeAdmin")
	private String collegeAdmin;
	
	@Column(name="collegeName")
	private String collegeName;
	
	@Column(name="location")
	private String location;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_Id")
	private User user;
	
	
	/*Mapping the relations
	@OneToMany(mappedBy="college")
	private List<Student> student;
	
	@OneToMany(mappedBy="user_id")
	private List<Placement> placement;
	

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Placement> getPlacement() {
		return placement;
	}

	public void setPlacement(List<Placement> placement) {
		this.placement = placement;
	}*/

	

	

	public User getuId() {
		return user;
	}

	public void setuId(User uId) {
		this.user = uId;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCollegeAdmin() {
		return collegeAdmin;
	}

	public void setCollegeAdmin(String collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}

}
