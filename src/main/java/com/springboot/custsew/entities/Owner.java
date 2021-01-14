package com.springboot.custsew.entities;

import com.springboot.custsew.entities.enums.Genre;
import com.springboot.custsew.entities.enums.TypeAccess;

public class Owner extends Person {

	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Owner(int id, String name, String phone, String CPF, Address address, Genre genre, TypeAccess typeAccess,
			User user) {
		super(id, name, phone, CPF, address, genre, typeAccess, user);
		// TODO Auto-generated constructor stub
	}
	
	

}
