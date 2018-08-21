package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.model.MonHoc;
import com.example.demo.model.SinhVien;



@SpringBootApplication
@Transactional
public class Student1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Student1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
}
