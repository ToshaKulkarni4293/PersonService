package com.tosha.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tosha.model.User1;
import com.tosha.repository.UserRepository;

@Service
public class UserService{

	@Autowired
	UserRepository userRepo;
	
	public List<User1> findAll(){
		List<User1> result = new ArrayList<>();
        userRepo.findAll().forEach(user -> result.add(user));
        return result;
	}
}
