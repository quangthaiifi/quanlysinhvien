package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="monhoc")
public class MonHoc {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="tenmonhoc")
	private String tenMon;
	
	@Column(name="sotrinh")
	private int soTrinh;

	public MonHoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MonHoc(Long id, String tenMon, int soTrinh) {
		super();
		this.id = id;
		this.tenMon = tenMon;
		this.soTrinh = soTrinh;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenMon() {
		return tenMon;
	}

	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}

	public int getSoTrinh() {
		return soTrinh;
	}

	public void setSoTrinh(int soTrinh) {
		this.soTrinh = soTrinh;
	}

	

	@Override
	public String toString() {
		return "MonHoc [id=" + id + ", tenMon=" + tenMon + ", soTrinh=" + soTrinh + "]";
	}
	
	
}
