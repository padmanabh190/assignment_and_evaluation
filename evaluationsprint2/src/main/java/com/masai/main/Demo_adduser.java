package com.masai.main;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.bean.PhoneNumber;
import com.masai.bean.User;
import com.masai.dbutil.Intr_user_impl;

public class Demo_adduser {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stdUnit");
		EntityManager em = emf.createEntityManager();
		
	
		PhoneNumber ph = new PhoneNumber();
		ph.setPhoneNumber(123456);
		ph.setPhoneType("home");
		
		
		PhoneNumber ph1 = new PhoneNumber();
		ph1.setPhoneNumber(654321);
		ph1.setPhoneType("office");
		
		
		PhoneNumber ph2 = new PhoneNumber();
		ph2.setPhoneNumber(123741);
		ph2.setPhoneType("landline");
		
		
		User ur = new User();
		ur.setEmailid("abcabcgmail.com");
		ur.setUserName("Prateeek");
		ur.getLtphone().add(ph);
		ur.getLtphone().add(ph1);
		ur.getLtphone().add(ph2);
		
		em.getTransaction().begin();
		
		ph.setUser(ur);
		ph1.setUser(ur);
		ph2.setUser(ur);
		em.persist(ur);
		
		em.getTransaction().commit();
		em.close();
		System.out.println("done...user added successfully");
	}

}
