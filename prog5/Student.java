package com.prog5.rvce;

public class Student {
	
	
	private String name;
	private int id;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}
