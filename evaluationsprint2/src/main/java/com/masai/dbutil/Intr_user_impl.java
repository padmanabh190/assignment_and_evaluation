package com.masai.dbutil;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.bean.PhoneNumber;
import com.masai.bean.User;
import com.masai.exep.User_exep;

public class Intr_user_impl implements Intr_user {

	@Override
	public String adduser(User user, PhoneNumber ph) {
		
		String ss = "user not added";
		
		
		
		return ss;
		
	}

	@Override
	public List<PhoneNumber> getphonebyname(String name) throws User_exep {
		// TODO Auto-generated method stub
		return null;
	}

}
