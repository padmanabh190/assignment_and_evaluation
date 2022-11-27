package com.masai.usecase;

import java.util.Scanner;

import com.masai.Dao.ClgStdDaoImpl;
import com.masai.Dao.Collage_Stud_Dao;
import com.masai.Entity.Collage;

public class PrintCollageByStudnetRoll {

	public static void main(String[] args) {

		Collage_Stud_Dao csd = new ClgStdDaoImpl();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student roll no : ");

		int sroll = sc.nextInt();
		
		
		Collage cg = csd.printCollageByStudnetRoll(sroll);
		
		String cname = cg.getCollageName();
		String cadd = cg.getCollageAddress();
		
		System.out.println("College name is: "+ cname);
		System.out.println("College address is: "+ cadd);
	}

}
