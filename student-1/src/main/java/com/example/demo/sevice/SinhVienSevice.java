package com.example.demo.sevice;

import java.util.List;

import com.example.demo.model.SinhVien;

public interface SinhVienSevice {
	
	List<SinhVien> getAllSinhVien();
	
	SinhVien findSinhVienById(Long id);	
	
	void deleteSinhVienById(Long id);

	void saveSinhVien(SinhVien sinhVien);
	
	SinhVien dangKyMonHoc(long idSv, long idMh);
	
	

	
	

}
