package com.masai.main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.masai.bean.PhoneNumber;
import com.masai.bean.User;
import com.masai.exep.User_exep;
import com.mysql.cj.Query;

public class Demo_getphonebyname {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name to seach phone numbers");
		String nam = sc.next();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stdUnit");
		EntityManager em = emf.createEntityManager();
		
		
		TypedQuery<User> tq = (TypedQuery<User>) em.createQuery("select p from User p where userName = :name", User.class);
		
		tq.setParameter("name", nam);
		
		User ur = tq.getSingleResult();
		
		try {
			if(ur!=null) {
				int idd = ur.getUserId();
				
				System.out.println(idd);
				
				javax.persistence.Query q =  em.createQuery("select p from PhoneNumber p where user_userId = :urid", PhoneNumber.class);
				
				q.setParameter("urid", idd);
				
				List<PhoneNumber> ll = q.getResultList();
				
				ll.forEach(s -> System.out.println(s.getPhoneNumber()));
			}else {
				throw new User_exep("user not found with name"+nam);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		
//		em.getTransaction().begin();
//		
//		
//		
//		System.out.println("done...user fetched successfully");

	}

}
