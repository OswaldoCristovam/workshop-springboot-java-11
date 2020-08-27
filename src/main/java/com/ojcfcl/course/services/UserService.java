package com.ojcfcl.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojcfcl.course.entities.User;
import com.ojcfcl.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findaById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
