package com.masai.main;

import java.time.LocalDate;
import java.util.Scanner;

import com.masai.bean.Mail;

import dbutil.Intr_User_impl;

public class Demo_addemail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Intr_User_impl it1 = new Intr_User_impl();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter email id to add into email table");
		String ma = sc.next();
		
		Mail m = new Mail(ma,LocalDate.now());
		
		String res = it1.createemail(m);
		System.out.println(res);
		
	}

}
