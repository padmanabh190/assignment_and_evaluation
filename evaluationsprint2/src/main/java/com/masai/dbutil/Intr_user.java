package com.masai.dbutil;

import java.util.List;

import com.masai.bean.PhoneNumber;
import com.masai.bean.User;
import com.masai.exep.User_exep;

public interface Intr_user {

	public String adduser(User user, PhoneNumber ph );
	
	public List<PhoneNumber> getphonebyname(String name) throws User_exep;
	
}
