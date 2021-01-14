package com.springboot.custsew.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String userName;
	private String password;

	public User() {
		
	}
	
	
	

	public User(String id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}




	public String validateUserName(String userName) {
	    Set<User> user = new HashSet<>();
		
		for(User u:user) {
			if(u.userName.equals(userName)) {
				throw new IllegalArgumentException("User name don't available, chose another");
				
			}else {
				System.out.println("");
				return "Success";
			}
		}
	return "Success";
	}

	
	public String validadePassword(String password) {
		int countString= password.length();
		
		if(password.length()<4) {
			throw new IllegalArgumentException("Password need more than "+password.length()+ " characters");
		}
		
		return "Success";
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}









}
