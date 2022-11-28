package com.masai.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Studentbean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo;
	private String name; 
	private String email; 
	private int mobile;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Coursebean courseId;

	public Studentbean() {}
	
	public Studentbean(String name, String email, int mobile, Coursebean courseId) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.courseId = courseId;
	}

	public Studentbean(int rollNo, String name, String email, int mobile, Coursebean courseId) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Studentbean [rollNo=" + rollNo + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", courseId=" + courseId + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public Coursebean getCourseId() {
		return courseId;
	}

	public void setCourseId(Coursebean courseId) {
		this.courseId = courseId;
	}
	
	
	
}
