package com.example.cs4500sp19s3hurleys1996.controllers.UserService;
import com.example.cs4500sp19s3hurleys1996.models.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserService {
	static List<User> users = new ArrayList();
	static {
		users.add(new User(123, "stacey", "stacey", "stacey", "Mom"));
		users.add(new User(234, "bob", "bob", "Bob", "Marley"));
	}
	
	@GetMapping("/api/user")
	public List<User> findAllUsers() {
		return users;
	}
	
	@GetMapping("/api/user/{userId}")
	public User findUserById(@PathVariable("userId") Integer id) {
		for(User user: users) {
			if(user.getId() == id) {
				return user;
		}
		}
		return null;
	}
}
	
	
	


