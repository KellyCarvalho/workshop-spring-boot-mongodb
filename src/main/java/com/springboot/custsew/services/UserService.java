package com.springboot.custsew.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.custsew.entities.User;
import com.springboot.custsew.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	public List<User> findAll(){
		
		return repo.findAll();
		
	}

}
