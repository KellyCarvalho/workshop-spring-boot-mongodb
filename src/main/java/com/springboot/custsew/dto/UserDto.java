package com.springboot.custsew.dto;

import java.io.Serializable;

import com.springboot.custsew.entities.User;

public class UserDto implements Serializable{
	private String id;
	private String userName;
	private String password;
	
	public UserDto() {
		
	}
	
	public UserDto(User obj) {
		id = obj.getId();
		userName=obj.getUserName();
		password =obj.getPassword();
		
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
	

}
