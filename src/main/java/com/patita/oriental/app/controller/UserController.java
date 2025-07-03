package com.patita.oriental.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patita.oriental.app.model.User;
import com.patita.oriental.app.service.UserService;

@CrossOrigin(origins = "*")
@RestController  //@Controller + @ResponseBody
@RequestMapping("/api/v1/users")
public class UserController {
	UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping // ("/api/v1/users") http://localhost:8080/api/v1/roles
	ResponseEntity<Iterable<User>> getAllUsers(){
		Iterable<User> products = userService.findAll();
		return ResponseEntity.ok(products);
	}
	
	@GetMapping("/active") //http://localhost:8080/api/v1/roles/active
	ResponseEntity<Iterable<User>> getAllActiveUsers(){
		Iterable<User> users = userService.getActiveUsers();
		return ResponseEntity.ok(users);
	}
	
	@PostMapping
	ResponseEntity<User> createUsers(@RequestBody User user) {
		User newProduct = userService.save(user);
		return new ResponseEntity<User> (newProduct, HttpStatus.CREATED); //201
	}
	
	@GetMapping("/{id}")// http://localhost:8080/api/v1/users/1
	User getUserById(@PathVariable("id") Long id) {
		return userService.findById(id);
	}
	
	@PutMapping("/{id}")
	User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		return userService.update(id, user);
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<Void> deleteUser(@PathVariable("id") Long id) {
		userService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
