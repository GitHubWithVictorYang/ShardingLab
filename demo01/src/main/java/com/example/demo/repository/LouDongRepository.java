package com.example.demo.repository;

import java.util.List;

import com.example.demo.po.LouDong;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface LouDongRepository {
	
	Long addLouDong(LouDong louDong);
	
	List<LouDong> list();
}
