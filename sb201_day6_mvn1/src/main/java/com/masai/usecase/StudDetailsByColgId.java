package com.masai.usecase;

import java.util.List;
import java.util.Scanner;

import com.masai.Dao.ClgStdDaoImpl;
import com.masai.Dao.Collage_Stud_Dao;
import com.masai.Entity.Student;

public class StudDetailsByColgId {

	public static void main(String[] args) {
		
		Collage_Stud_Dao csd = new ClgStdDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter College id : ");
		
		int cid = sc.nextInt();
		
		List<Student> students = csd.studDetailsByColgId(cid);
		
		if(students!=null) {
			students.forEach( s -> {
				
			System.out.println("Student name is : "+s.getStudentName());
			System.out.println("Student Email is : "+s.getEmail());
			System.out.println("Student mobile no. is : "+s.getMobileNumber());
			System.out.println("Student roll no. is : "+s.getStudentRoll());
			
			System.out.println("==========================================");
			
			});
		}else {
			System.out.println(students);
		}
		
		

	}

}
