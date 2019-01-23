package com.example.cs4500sp19s3hurleys1996.controllers.UserService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserService {
	@GetMapping("/api/user")
	public List<User> findAllUsers() {
		return users;
	}
	
	@GetMapping("/api/user/{userId}")
	public User findUserById(
		@PathVariable("userId") Integer id) {
		for(User user: users) {
			if(user.getId() == id) {
				return user;
		}
		return null;
	}
}

