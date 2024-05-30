package com.security.practice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.security.practice.models.User;

@Service
public class UserService {
	
	ArrayList<User> list = new ArrayList<>();
	
	public UserService()
	{
		list.add(new User("Aditha", "Karikalam", "chola.empire.@gmail.com"));
		list.add(new User("Parantaka", "Pandya", "pandya.empire.@gmail.com"));
	}
	
	//get all users
	
	public List<User> get_allUsers()
	{
		return this.list;
		
	}
	
	//get single user
	
	public User getUser(String username)
	{
		return this.list.stream().filter((user)-> user.getUsername().equals(username)).findAny().orElse(null);
	}
	
	//add user
	
	public User addUser(User user)
	{
		this.list.add(user);
		return user;
	}
}
