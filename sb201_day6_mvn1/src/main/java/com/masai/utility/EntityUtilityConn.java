package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityUtilityConn {
	
private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("stdUnit");
	}
	
	public static EntityManager provideEntityManager(){
		
		
		
		return emf.createEntityManager();
	}
	
}
