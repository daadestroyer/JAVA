package com.rvce.prog3_practice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int sid;
	private String sname;
	private String scourse;
	private String scity;
	
	

	public Student(int sid, String sname, String scourse, String scity) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scourse = scourse;
		this.scity = scity;
	}



	public int getSid() {
		return sid;
	}



	public void setSid(int sid) {
		this.sid = sid;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public String getScourse() {
		return scourse;
	}



	public void setScourse(String scourse) {
		this.scourse = scourse;
	}



	public String getScity() {
		return scity;
	}



	public void setScity(String scity) {
		this.scity = scity;
	}



	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scourse=" + scourse + ", scity=" + scity + "]";
	}	
	
	
	
}
