package com.masai.main;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

import com.masai.bean.Mail;
import com.masai.bean.User;

import dbutil.Intr_User_impl;

public class Demo_getuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Intr_User_impl it1 = new Intr_User_impl();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter user id to get details");
		int pho = sc.nextInt();
		
		
		User u = it1.getuserdetails(pho);
		System.out.println(u.getName());
		System.out.println(u.getPhoneNo());
		System.out.println(u.getDateOfBirth());
		System.out.println(u.getMl().getEmail());
		System.out.println(u.getMl().getCreated_date());
		
		
		
	}

}
