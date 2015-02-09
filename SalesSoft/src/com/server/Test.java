package com.server;

import com.domain.Company;
import com.domain.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User();
		u.setUserId(2);
		u.setIsAdmin(true);
		u.setPassword("ishouhkkuhr");
		u.setUsername("shfhgkugkudds");
		
		DataManager.addUser(u);
		
		Company c= new Company();
		c.setC_city("Pune");
		c.setC_email("kishor@gmail.com");
		c.setC_id(1);
		c.setC_name("Temmo ");
		DataManager.addCompany(c);
		
	}

}
