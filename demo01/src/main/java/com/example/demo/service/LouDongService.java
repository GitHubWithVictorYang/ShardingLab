package com.example.demo.service;

import java.util.List;

import com.example.demo.po.LouDong;

public interface LouDongService {

	List<LouDong> list();
	
	Long addLouDong(LouDong louDong);
		
}
