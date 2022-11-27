package com.masai.main;

import java.util.Scanner;

import dbutil.Intr_User_impl;

public class Demo_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Intr_User_impl it1 = new Intr_User_impl();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter user id to delete");
		int pho = sc.nextInt();
		
		String res = it1.deleteuser(pho);
		System.out.println(res);
	}

}
