package com.example.demo.sevice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.MonHoc;
import com.example.demo.model.SinhVien;

@Service
public class SinhVienSeviceIplm implements SinhVienSevice{
	
	@Autowired
	SinhVienRepository sinhVienRepository;
	
	@Autowired
	MonHocRepository monHocRepository;
	
	@Override
	public List<SinhVien> getAllSinhVien() {
		return sinhVienRepository.findAll();
	
		
	}

	

	@Override
	public void deleteSinhVienById(Long id) {
		 sinhVienRepository.delete(id);
		 
		
	}

	@Override
	public void saveSinhVien(SinhVien sinhVien) {
		sinhVienRepository.save(sinhVien);
		
	}
	@ResponseBody
	@Override
	public SinhVien dangKyMonHoc(long idSv, long idMh) {
			SinhVien sinhVien = sinhVienRepository.findById(idSv);
			MonHoc monHoc = monHocRepository.findById(idMh);
			System.out.println(monHoc);
			if(sinhVien==null  ||  monHoc== null)
			{
				System.out.println("khong ton tai sinh vien hoac mon hoc");
			}
			else {
				System.out.println(sinhVien);
				sinhVien.getMonHoc().add(monHoc);
				sinhVienRepository.save(sinhVien);
			}
			return sinhVienRepository.findById(idSv);
		
	}



	@Override
	public SinhVien findSinhVienById(Long id) {
		// TODO Auto-generated method stub
		return sinhVienRepository.findById(id);
	}

	
		
	
	

}
