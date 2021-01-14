package com.springboot.custsew.entities;

import com.springboot.custsew.entities.enums.Genre;
import com.springboot.custsew.entities.enums.TypeAccess;

public class Customer extends Person{

	private static final long serialVersionUID = 1L;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String phone, String CPF, Address address, Genre genre, TypeAccess typeAccess,
			User user) {
		super(id, name, phone, CPF, address, genre, typeAccess, user);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
