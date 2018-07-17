package com.tosha.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tosha.model.User1;
import com.tosha.repository.UserRepository;


@RestController
@RequestMapping("/rest/users")
public class UserController {
	@Autowired
	 private UserService userService;

//	    public UserService(UserRepository userRepository) {
//	        this.userRepository = userRepository;
//	    }

	    @GetMapping("/all")
	    public List<User1> getAll() {
	        return userService.findAll();
	    }
}
