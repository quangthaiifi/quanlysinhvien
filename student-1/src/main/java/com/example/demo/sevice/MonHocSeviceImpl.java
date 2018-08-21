package com.example.demo.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MonHoc;

@Service
public class MonHocSeviceImpl implements MonHocSevice {

	@Autowired
	MonHocRepository monHocRepository;
	@Override
	public List<MonHoc> findAll() {
		
		return monHocRepository.findAll();
	}

	@Override
	public MonHoc findMonHocById(long id) {
		// TODO Auto-generated method stub
		return monHocRepository.findById(id);
	}

	@Override
	public void deleteMonhoc(long id) {
		// TODO Auto-generated method stub
		monHocRepository.delete(id);
	}

	@Override
	public void saveMonHoc(MonHoc monHoc) {
		// TODO Auto-generated method stub
		monHocRepository.save(monHoc);
		
	}

}
