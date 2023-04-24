package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.po.User;


@Mapper
public interface UserRepository {
	
	Long addUser(User user);
	
	List<User> list();
	

}
