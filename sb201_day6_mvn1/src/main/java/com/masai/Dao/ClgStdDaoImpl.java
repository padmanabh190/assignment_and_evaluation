package com.masai.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.masai.Entity.Collage;
import com.masai.Entity.Student;
import com.masai.utility.EntityUtilityConn;

public class ClgStdDaoImpl implements Collage_Stud_Dao{
	
	@Override
	public String enterCollageDetails(Collage clg) {
		
		String str = "Collage details not succsfully added...";
		
		EntityManager em = EntityUtilityConn.provideEntityManager();
		
		if(clg.getCollageName()!=null) {
			
			em.getTransaction().begin();
			
			em.persist(clg);
			
			str = "Collage deatils were added...";
			
			
			
			em.getTransaction().commit();
			em.close();
		}
		
		
		return str;
		
	}
	

	@Override
	public List<Student> studDetailsByColgId(int clgId) {
		
		EntityManager em = EntityUtilityConn.provideEntityManager();
		
		Collage cg = em.find(Collage.class, clgId);
		
		List<Student> clgStudents = cg.getStudents();
		
		return clgStudents;
		
		
	}

	@Override
	public Collage printCollageByStudnetRoll(int studRoll) {
		
		EntityManager em = EntityUtilityConn.provideEntityManager();
		
		Student st = em.find(Student.class, studRoll);
		
		Collage clg = st.getClg();
		
		return clg;
	}

	

	
	
}
