package com.prog3.demo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class App {

	public static void main(String[] args) {
		System.out.println("Program Started...");
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("By - Shubham Nigam");
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("***************************");

		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("=========================");
			System.out.println("1. add data");
			System.out.println("2. delete data");
			System.out.println("3. get data by usn");
			System.out.println("4. get all data");
			System.out.println("5. exit");
			 
			 
			System.out.println("***************************");
			System.out.println("By - Shubham Nigam");
			System.out.println("***************************");
			 
			int ch = sc.nextInt();
			// starting session
			Session openSession = sessionfactory.openSession();

			// start transaction
			Transaction txn = openSession.beginTransaction();
			if (ch == 1) {
				System.out.println("Enter usn");
				String usn = sc.next();

				System.out.println("Enter name");
				String name = sc.next();

				System.out.println("Enter course");
				String course = sc.next();

				System.out.println("Enter city");
				String city = sc.next();

				Student student = new Student(usn, name, course, city);
				openSession.save(student);
				txn.commit();
				
				
			} else if (ch == 2) {
				System.out.println("Enter usn");
				String usn = sc.next();
				
				Student student = openSession.get(Student.class, usn);
				System.out.println("\n");
				if(student == null) {
					System.out.println("Student with usn "+usn+" not found...");
				}
				else {
					openSession.delete(student);
					txn.commit();
					System.out.println("\n");
					System.out.println("Student with usn "+usn+" deleted...");
				}
				System.out.println("\n");
				 
			} else if (ch == 3) {
				System.out.println("Enter usn");
				String usn = sc.next();
				
				Student student = openSession.get(Student.class,usn);
				System.out.println();
				System.out.println("Data of student having usn "+usn+" is this : ");
				System.out.println("-----------------------------------------------");
				System.out.println("Student USN :"+student.getUsn());
				System.out.println("Student Name :"+student.getName());
				System.out.println("Student Course :"+student.getCourse());
				System.out.println("Student City :"+student.getCity());
				System.out.println("-----------------------------------------------");
				System.out.println("\n");
				// commiting into db
				txn.commit();
			} 
			else if(ch == 4) {
				List list = openSession.createQuery("from Student").list();
				System.out.println("\n");
				System.out.println("All data of student");
				System.out.println("----------------------");
				
				for(int i=0 ; i<list.size() ; i++) {
					Student student = (Student) list.get(i);
					 
					System.out.println("Student USN :"+student.getUsn());
					System.out.println("Student Name :"+student.getName());
					System.out.println("Student Course :"+student.getCourse());
					System.out.println("Student City :"+student.getCity());
					System.out.println("------------------------------");
				}
				System.out.println("\n");
				
				// commiting into db
				txn.commit();
				
				
			}
			else if (ch == 5) {
				System.out.println("EXITING...");
				break;
			} else {
				System.out.println("WRONG CHOICE...");
				break;
			}

			

			

		}
		
		System.out.println("Program Ended...");
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("By - Shubham Ni5gam");
		System.out.println("***************************");
		System.out.println("***************************");

	}

}
