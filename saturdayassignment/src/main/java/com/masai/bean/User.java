package com.masai.bean;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GeneratorType;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	private String name;
	private int phoneNo;
	private Date dateOfBirth;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Mail ml;

	public User() {}
	
	public User(String name, int phoneNo, Date dateOfBirth, Mail ml) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.dateOfBirth = dateOfBirth;
		this.ml = ml;
	}

	public User(int id, String name, int phoneNo, Date dateOfBirth, Mail ml) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.dateOfBirth = dateOfBirth;
		this.ml = ml;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", dateOfBirth=" + dateOfBirth + ", ml="
				+ ml + "]";
	}

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

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Mail getMl() {
		return ml;
	}

	public void setMl(Mail ml) {
		this.ml = ml;
	}
	
	
}
