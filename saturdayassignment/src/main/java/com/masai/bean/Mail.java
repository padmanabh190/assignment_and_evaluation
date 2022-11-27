package com.masai.bean;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mail_id;
	private String email;
	private LocalDate created_date;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User user;

	
	public Mail() {}
	
	public Mail(String email, LocalDate created_date) {
		super();
		this.email = email;
		this.created_date = created_date;
	}
	public Mail(int mail_id, String email, LocalDate created_date) {
		super();
		this.mail_id = mail_id;
		this.email = email;
		this.created_date = created_date;
	}
	@Override
	public String toString() {
		return "Mail [mail_id=" + mail_id + ", email=" + email + ", created_date=" + created_date + "]";
	}
	public int getMail_id() {
		return mail_id;
	}
	public void setMail_id(int mail_id) {
		this.mail_id = mail_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getCreated_date() {
		return created_date;
	}
	public void setCreated_date(LocalDate created_date) {
		this.created_date = created_date;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
