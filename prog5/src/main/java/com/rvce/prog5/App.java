package com.rvce.prog5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rvce/prog5/config.xml");
		Emp e1 = context.getBean("emp1", Emp.class);
		System.out.println(e1);

	}
}