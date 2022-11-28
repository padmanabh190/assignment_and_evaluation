package com.masai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String emailid;
	
	@OneToMany(cascade = CascadeType.ALL)
	
	List<PhoneNumber> ltphone = new ArrayList<>();


	
	public User(String userName, String emailid, List<PhoneNumber> ltphone) {
		super();
		this.userName = userName;
		this.emailid = emailid;
		this.ltphone = ltphone;
	}

	public User(int userId, String userName, String emailid, List<PhoneNumber> ltphone) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailid = emailid;
		this.ltphone = ltphone;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", emailid=" + emailid + ", ltphone=" + ltphone
				+ "]";
	}

	public User() {}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public List<PhoneNumber> getLtphone() {
		return ltphone;
	}

	public void setLtphone(List<PhoneNumber> ltphone) {
		this.ltphone = ltphone;
	}
	
	
	
	
}
