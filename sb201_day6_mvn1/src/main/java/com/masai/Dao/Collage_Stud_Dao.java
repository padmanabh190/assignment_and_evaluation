package com.masai.Dao;

import java.util.List;

import com.masai.Entity.Collage;
import com.masai.Entity.Student;

public interface Collage_Stud_Dao {
	
	public String enterCollageDetails(Collage clg);
	
	public List<Student> studDetailsByColgId(int clgId);
	
	public Collage printCollageByStudnetRoll(int studRoll);
	
}
