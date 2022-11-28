package com.masai.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.masai.bean.Coursebean;
import com.masai.bean.Studentbean;
import com.masai.exep.Course_exep;
import com.masai.exep.Stud_exep;

public class Demo_getstudentbyrollnumber {

	public static void main(String[] args) {
		
		try {
			getstudebyid(4);
		} catch (Stud_exep e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getstudebyid(int id_roll)throws Stud_exep {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stdUnit");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Studentbean> tq = em.createQuery("select c from Studentbean c where rollNo = :rlno ",Studentbean.class);
		tq.setParameter("rlno", id_roll);
		
		Studentbean sb1 = tq.getSingleResult();
		if(sb1!=null) {
			System.out.println(sb1.getName());
			System.out.println(sb1.getRollNo());
			System.out.println(sb1.getMobile());
			System.out.println(sb1.getEmail());
		}else {
			throw new Stud_exep("Student not found");
		}
		
		TypedQuery<Coursebean> tq1 = em.createQuery("select c from Coursebean c where courseid = :cid ",Coursebean.class);
		tq1.setParameter("cid", sb1.getCourseId());
		
		Coursebean cb1 = tq1.getSingleResult();
		if(cb1!=null) {
			System.out.println("=============course details============");
			System.out.println(cb1.getCourseName());
			System.out.println(cb1.getCourseId());
			System.out.println(cb1.getDuration());
			System.out.println(cb1.getFee());
		}
	}
	
}
