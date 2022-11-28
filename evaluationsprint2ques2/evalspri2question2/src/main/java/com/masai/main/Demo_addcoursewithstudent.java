package com.masai.main;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.bean.Coursebean;
import com.masai.bean.Studentbean;

public class Demo_addcoursewithstudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Studentbean sb = new Studentbean();
		sb.setName("padmanabh");
		sb.setMobile(84850);
		sb.setEmail("desai@gmail.com");
		
		Studentbean sb1 = new Studentbean();
		sb1.setName("rohit");
		sb1.setMobile(69322);
		sb1.setEmail("rohit1@gmail.com");
		
		Coursebean cb = new Coursebean();
		cb.setCourseName("full stack developement");
		cb.setDuration("7 months");
		cb.setFee(300000);
		cb.getLt().add(sb);
		cb.getLt().add(sb1);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stdUnit");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		sb.setCourseId(cb);
		sb1.setCourseId(cb);
		em.persist(cb);
		
		em.getTransaction().commit();
		em.close();
		System.out.println("college added successfully with student details");

	}

}
