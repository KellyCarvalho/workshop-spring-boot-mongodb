package com.springboot.custsew.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.custsew.dto.UserDto;
import com.springboot.custsew.entities.User;
import com.springboot.custsew.repositories.UserRepository;
import com.springboot.custsew.services.exception.ObjectNotFoundException;
import com.sun.jdi.ObjectCollectedException;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	public List<User> findAll(){
		
		return repo.findAll();
		
	}

	public User findById(String id) {
		Optional<User> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("No one user found using this code"));	
		}
	
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDto userDto) {
		return new User(userDto.getId(),userDto.getUserName(),userDto.getPassword());
	}
	public void delete(String id) {
		findById(id);
		 repo.deleteById(id);
		 
	}
	
	public User update(User obj) {
		User newObj = findById(obj.getId());
		updateData(newObj,obj);
		return repo.save(newObj);
	}

	private void updateData(User newObj, User obj) {
		newObj.setUserName(obj.getUserName());
		newObj.setPassword(obj.getPassword());
		
	}
	
}
