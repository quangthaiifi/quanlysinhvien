package com.example.demo.sevice;

import java.util.List;

import com.example.demo.model.MonHoc;

public interface MonHocSevice {
	
	List<MonHoc> findAll();
	
	MonHoc findMonHocById(long id);
	
	void deleteMonhoc(long id);
	
	void saveMonHoc(MonHoc monHoc);
	
	
	
}
