package com.masai.usecase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.masai.Dao.ClgStdDaoImpl;
import com.masai.Dao.Collage_Stud_Dao;
import com.masai.Entity.Collage;
import com.masai.Entity.Student;

public class EnterCollageDetails {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Collage_Stud_Dao csd = new ClgStdDaoImpl();
		
		
		
		System.out.println("Enter collage Name: ");
		String clgname = sc.next();
		
		System.out.println("Enter collage address: ");
		String clgaddress = sc.next();
		
		List<Student> stds = new ArrayList<>();
		
		System.out.println("Enter 4 student details ");
		System.out.println();
		
		Collage clg = new Collage();
		clg.setCollageName(clgname);
		clg.setCollageAddress(clgaddress);
		
		int i=0;
		
		while(i++ <4) {
			
			
			System.out.println("Enter Student Name: ");
			String stdname = sc.next();
			
			
			System.out.println("Enter Student mobile number: ");
			int studmob = sc.nextInt();
			
			
			System.out.println("Enter Studnet email: ");
			String studemail = sc.next();
			
			System.out.println();
			
			Student std = new Student();
			std.setStudentName(stdname);
			std.setMobileNumber(studmob);
			std.setEmail(studemail);
			std.setClg(clg);
			
			
			stds.add(std);
			clg.getStudents().add(std);
			
		}
		
		clg.setStudents(stds);
		
		
		
		String str =  csd.enterCollageDetails(clg);
		System.out.println(str);
		
		
	}
	}
			
		
	

