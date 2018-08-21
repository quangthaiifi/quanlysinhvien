package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MonHoc;
import com.example.demo.model.SinhVien;
import com.example.demo.sevice.SinhVienSevice;

@RestController
public class SinhVienConTroller {

	@Autowired
	SinhVienSevice sinhVienSevice;
	
	@ResponseBody
	@GetMapping(value="/sinhviens")
	public List<SinhVien> getAll()
	{
		
		return sinhVienSevice.getAllSinhVien();
	}
	
	@ResponseBody
	@GetMapping(value="/sinhvien/{id}")
	public SinhVien findSinhVienById(@PathVariable long id) {
			
		return sinhVienSevice.findSinhVienById(id);
		
	}
	@PostMapping(value="/sinhvien")
	public void createSinhVien(@RequestBody SinhVien sinhVien  ) {
		System.out.println(sinhVien);
		
		sinhVienSevice.saveSinhVien(sinhVien);
	}
	@PutMapping(value="/sinhvien/{id}")
	public void updateSinhVien(@RequestBody SinhVien sinhVien,@PathVariable long id) {
		SinhVien sinhVien2 = sinhVienSevice.findSinhVienById(id);
		sinhVien = sinhVien2;
		sinhVien.setId(id);
		sinhVienSevice.saveSinhVien(sinhVien);
		
	}
	@DeleteMapping(value="/sinhvien/{id}")
	public void deleteSinhVien(@PathVariable long id) {
		sinhVienSevice.deleteSinhVienById(id);
	}
	@GetMapping(value="/luusinhvien/{idsv}/{idmh}")
	public void dangKyMonhoc(@PathVariable long idsv,@PathVariable long idmh) {
		System.out.println("day roi");
		sinhVienSevice.dangKyMonHoc(idsv, idmh);
		
	}
	
}
