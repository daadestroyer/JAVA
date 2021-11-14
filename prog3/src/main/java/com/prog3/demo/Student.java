package com.prog3.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private String usn;
	private String name;
	private String course;
	private String city;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String usn, String name, String course, String city) {
		super();
		this.usn = usn;
		this.name = name;
		this.course = course;
		this.city = city;
	}


	public String getUsn() {
		return usn;
	}


	public void setUsn(String usn) {
		this.usn = usn;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", course=" + course + ", city=" + city + "]";
	}
	
	
	 
	
	
}
