package com.security.practice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.practice.models.User;
import com.security.practice.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//all users
	@GetMapping("/all_users")
	public List<User> get_allUsers()
	{
		
		return this.userService.get_allUsers();
	}
	
	//return single user
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username)
	{
		return this.userService.getUser(username);
	}
	
	
	@PostMapping("/")
	public User addUser(@RequestBody User user)
	{
		return this.userService.addUser(user);
	}

	
	
}
