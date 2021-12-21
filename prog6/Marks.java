package com.rvce.prog6;

public class Marks {

	private int marks1;
	private int marks2;

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public Marks(int marks1, int marks2) {
		super();
		this.marks1 = marks1;
		this.marks2 = marks2;
	}
	public Marks( ) {
		 
	}
	@Override
	public String toString() {
		return "Marks [marks1=" + marks1 + ", marks2=" + marks2 + "]";
	}

}
