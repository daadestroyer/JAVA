package com.rvce.prog6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student s1 = context.getBean("getStudent",Student.class);
		Marks m1 = context.getBean("getMarks",Marks.class);
		
		s1.setId(101);
		s1.setName("shubham");
		s1.setCourse("MCA");
		
		m1.setMarks1(100);
		m1.setMarks2(200);
		s1.setMarks(m1);
		
		
		System.out.println(s1);
	}
}
