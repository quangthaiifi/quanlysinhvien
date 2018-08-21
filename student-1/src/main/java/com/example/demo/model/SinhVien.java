package com.example.demo.model;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.transaction.Transactional;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="sinhvien")
public class SinhVien {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	private String tenSV;
	
	@Column(name="ngaysinh")
	

	private String ngaySinh;
	
	@Column(name="gioitinh")
	private int gioiTinh;
	
	@Column(name="quequan")
	private String queQuan;
	
	@Column(name="lop")
	private String lop;
	
	@Access(AccessType.PROPERTY)@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })

	  @JoinTable(
	      name="EMP_PROJ",
	      joinColumns=@JoinColumn(name="idsinhvien",referencedColumnName="id"),
	      inverseJoinColumns=@JoinColumn(name="idmonhoc"))
	  private Set<MonHoc> monHoc;
	
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public SinhVien(Long id, String tenSV, String ngaySinh, int gioiTinh, String queQuan, String lop,
			Set<MonHoc> monHoc) {
		super();
		this.id = id;
		this.tenSV = tenSV;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
		this.lop = lop;
		this.monHoc = monHoc;
	}



	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		lop = lop;
	}
	

	public Set<MonHoc> getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(Set<MonHoc> monHoc) {
		this.monHoc = monHoc;
	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", tenSV=" + tenSV + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh
				+ ", queQuan=" + queQuan + ", Lop=" + lop + ", monHoc=" + monHoc + "]\n";
	}

	
	
}
