package com.elitech.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elitech.model.User;

@RestController
public class UserController {
// get post put delete patch
	private List<User> users=new ArrayList<User>();
	
	@PostMapping("user")
	public String addUser(@RequestBody User user)
	{
		users.add(user);
		return user.toString();
		
	}

}
