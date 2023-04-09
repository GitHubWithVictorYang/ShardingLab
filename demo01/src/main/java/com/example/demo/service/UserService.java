package com.example.demo.service;

import java.util.List;

import com.example.demo.po.User;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);
	
}
