package com.sujata.db;

import java.util.HashMap;

public class UserDetails {

	static private HashMap<String, String> users=new HashMap();
	
	static {
		users.put("Sujata","Batra");
		users.put("admin1","pwd1");
		users.put("userx", "pwd123");
	}

	public static HashMap<String, String> getUsers() {
		return users;
	}
	
	
}
