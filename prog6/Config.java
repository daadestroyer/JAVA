package com.rvce.prog6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Student getStudent() {
		Student st = new Student();
		st.setMarks(st.getMarks());
		return st;
	}
	
	@Bean
	public Marks getMarks() {
		return new Marks();
	}
}
