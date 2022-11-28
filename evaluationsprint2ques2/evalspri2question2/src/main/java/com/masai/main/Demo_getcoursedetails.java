package com.masai.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.bean.Coursebean;
import com.masai.bean.Studentbean;
import com.masai.exep.Course_exep;
import com.masai.exep.Stud_exep;

public class Demo_getcoursedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			getcourseid(3);
		} catch (Course_exep e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void getcourseid(int id_roll)throws Course_exep {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stdUnit");
		EntityManager em = emf.createEntityManager();
		
		Query tq = em.createQuery("select c from Coursebean c join Studentbean s on c.courseid=s.courseId_courseId where c.courseId = :cid",Coursebean.class);
		tq.setParameter("cid", id_roll);
		
		
		List<Coursebean> lb = tq.getResultList();
		
		if(lb!=null) {
			System.out.println("=============course details============");
			
			for(Coursebean ccb: lb) {
				System.out.println(ccb.getCourseId());
				System.out.println(ccb.getCourseName());
				System.out.println(ccb.getDuration());
				System.out.println(ccb.getFee());
				System.out.println(ccb.getLt());
			}
		}else {
			throw new Course_exep("course not found");
		}

}
}
