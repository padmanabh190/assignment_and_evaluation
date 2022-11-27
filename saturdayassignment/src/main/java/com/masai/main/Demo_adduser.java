package com.masai.main;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

import com.masai.bean.Mail;
import com.masai.bean.User;

import dbutil.Intr_User_impl;

public class Demo_adduser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Intr_User_impl it1 = new Intr_User_impl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter user name");
		String nm = sc.next();
		sc.nextLine();
		System.out.println("enter user phone number");
		int pho = sc.nextInt();
		
		System.out.println("enter user date of birth in yyyy-mm-dd");
		String dt = sc.next();
		
		
		System.out.println("enter user mail id");
		String mail1 = sc.next();
		
		LocalDate lt = LocalDate.now();
		
		
		
		Mail ml = new Mail(mail1,lt);
		User user = new User(nm,pho,Date.valueOf(dt),ml);
		ml.setUser(user);
		user.setMl(ml);
		
		
		
		
		String ss = it1.adduser(user,ml);
		System.out.println(ss);
		
	}

}
