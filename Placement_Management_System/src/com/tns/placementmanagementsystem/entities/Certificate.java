package com.tns.placementmanagementsystem.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="certificate")
public class Certificate implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="year")
	private int year;
	
	
	@Column(name="college_id")
	private College college;
	
	
	//Mapping the relation
	@OneToOne(mappedBy="certificate")
	private Student student;

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	

	

}
