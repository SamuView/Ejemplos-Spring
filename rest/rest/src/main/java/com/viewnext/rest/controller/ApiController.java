package com.viewnext.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.rest.model.User;
import com.viewnext.rest.repo.UserRepository;

@RestController
public class ApiController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/")
	public String getPage() {
		return "Welcome";
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userRepo.findAll();
	}
	
	@PostMapping("/save")
	public String saveUser(@RequestBody User user) {
		userRepo.save(user);
		return "Saved..";
	}
	
	@PutMapping("/update/{id}")
	public String updateUser(@PathVariable long id,@RequestBody User user) {
		User updatedUser = userRepo.findById(id).get();
		updatedUser.setFirstName(user.getFirstName());
		updatedUser.setLastName(user.getLastName());
		updatedUser.setOccupation(user.getOccupation());
		updatedUser.setAge(user.getAge());
		userRepo.save(updatedUser);
		return "Updated..";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable long id) {
		User deleteUser = userRepo.findById(id).get();
		userRepo.delete(deleteUser);
		return "Delete user with id: "+id;
	}
	
}
