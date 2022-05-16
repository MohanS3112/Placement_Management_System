package com.tns.placementmanagementsystem.entities;


// Importing this interface to make serial id 
import java.io.Serializable;

//Importing annotation from persistence 
import javax.persistence.*;


//Below annotation states that, the below class is a table in DB
@Entity
@Table(name="user")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	//Defining private instance variable
	// With Id annotation we are indicating that this is a primary key field
	@Id
	@Column(name="user_id")
	private int id;
	
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="type")
	private String type;
	
	//Mapping the relation
	@OneToOne(mappedBy="user")
	private College college;

	//private String password;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/*public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}*/
}