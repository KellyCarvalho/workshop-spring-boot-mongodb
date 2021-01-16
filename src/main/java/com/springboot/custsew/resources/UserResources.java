package com.springboot.custsew.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springboot.custsew.dto.UserDto;
import com.springboot.custsew.entities.User;
import com.springboot.custsew.services.UserService;


@RestController
@RequestMapping(value = "/users")
public class UserResources {
	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<UserDto>> findAll() {

		List<User> users = service.findAll();
        List<UserDto> listDto = users.stream().map(x -> new UserDto(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);

	}

	@GetMapping(value="/{id}")
	public ResponseEntity<UserDto> findById(@PathVariable String id) {

		User user = service.findById(id);
		return ResponseEntity.ok().body(new UserDto(user));

	}
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody UserDto userDto) {

		User user = service.fromDTO(userDto);
		user = service.insert(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(uri).build();
		}
	
@DeleteMapping(value="/{id}")
public ResponseEntity<Void> delete(@PathVariable String id){
	service.delete(id);
	
	return ResponseEntity.noContent().build();
}

	@PostMapping(value="{id}")
	public ResponseEntity<Void> update(@RequestBody UserDto userDTO, @PathVariable String id ){
		User user =service.fromDTO(userDTO);
		user.setId(id);
		user = service.update(user);
		return ResponseEntity.noContent().build();

		
	}

}
