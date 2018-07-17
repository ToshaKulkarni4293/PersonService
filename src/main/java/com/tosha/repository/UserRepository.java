package com.tosha.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tosha.model.User1;



public interface UserRepository  extends CrudRepository<User1, Long>{
	// List<User1> findAllUsers();
}
