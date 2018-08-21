package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;import org.springframework.util.SocketUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MonHoc;
import com.example.demo.sevice.MonHocSevice;

@RestController
public class MonHocController {

	@Autowired
	MonHocSevice monHocSevice;

	@ResponseBody
	@GetMapping(value = "/")
	public String home() {
		return "Xin chao";
	}

	@ResponseBody
	@GetMapping(value = "/monhocs")
	public List<MonHoc> getAll() {
		return monHocSevice.findAll();

	}

	@ResponseBody
	@GetMapping(value = "/monhoc/{id}")
	public MonHoc getMonHocById(@PathVariable long id) {
		return monHocSevice.findMonHocById(id);
	}

	@PutMapping(value = "/monhoc/{id}")
	public void updateMonHoc(@RequestBody MonHoc monHoc, @PathVariable long id) {
		MonHoc monHoc2 = monHocSevice.findMonHocById(id);
		monHocSevice.saveMonHoc(monHoc2);
	}

	@PostMapping(value = "/monhoc")
	public void createMonHoc(@RequestBody MonHoc monHoc) {
		monHocSevice.saveMonHoc(monHoc);
	}

	@DeleteMapping(value = "/monhoc/{id}")
	public void deleteMonHoc(@PathVariable long id) {
		try{
			monHocSevice.deleteMonhoc(id);
		}catch (Exception e) {
					System.out.println("Co sinh vien dang dang ky");}
		
	}
}
