package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	private String sbranch;
	private String semail;
	private Long spho;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(Integer sid, String sname, String sbranch, String semail, Long spho) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sbranch = sbranch;
		this.semail = semail;
		this.spho = spho;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public Long getSpho() {
		return spho;
	}
	public void setSpho(Long spho) {
		this.spho = spho;
	}
	@Override
	public String toString() {
		return "StudentEntity [sid=" + sid + ", sname=" + sname + ", sbranch=" + sbranch + ", semail=" + semail
				+ ", spho=" + spho + "]";
	}
}