package com.springboot.custsew.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.springboot.custsew.entities.User;
import com.springboot.custsew.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "MariaBrown", "54435345");
		User alex = new User(null, "AlexGreen", "546456");
		User bob = new User(null, "BobGrey", "465464545");
		
		userRepository.saveAll(Arrays.asList(maria,alex,bob));
		
	}

}
