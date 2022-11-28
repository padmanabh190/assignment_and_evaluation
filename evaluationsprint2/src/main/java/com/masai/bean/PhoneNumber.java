package com.masai.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PhoneNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int phoneId;
	private int phoneNumber;
	private String phoneType;
	
	@ManyToOne(cascade = CascadeType.ALL)
	
	private User user;

	public PhoneNumber() {}
	
	public PhoneNumber(int phoneNumber, String phoneType, User user) {
		super();
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
		this.user = user;
	}

	public PhoneNumber(int phoneId, int phoneNumber, String phoneType, User user) {
		super();
		this.phoneId = phoneId;
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
		this.user = user;
	}

	@Override
	public String toString() {
		return "PhoneNumber [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber + ", phoneType=" + phoneType
				+ ", user=" + user + "]";
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
