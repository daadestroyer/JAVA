package com.rvce.prog3_practice;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.transaction.spi.TransactionStatus;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. add data");
			System.out.println("2. delete data");
			System.out.println("3. get data by usn");
			System.out.println("4. get all data");
			System.out.println("5. exit");

			int ch = sc.nextInt();

			if (ch == 1) {

				System.out.println("Enter usn");
				int sid = sc.nextInt();

				System.out.println("Enter name");
				String name = sc.next();

				System.out.println("Enter course");
				String course = sc.next();

				System.out.println("Enter city");
				String city = sc.next();

				Student student = new Student(sid, name, course, city);

				openSession.save(student);

				if (!beginTransaction.getStatus().equals(TransactionStatus.ACTIVE)) {
					beginTransaction.commit();
				}

			} else if (ch == 2) {
				System.out.println("Enter usn");
				int sid = sc.nextInt();
				
				Student student = openSession.find(Student.class, sid);
				if (student != null) {
					openSession.delete(student);
				} else {
					System.out.println("No data found");
				}

				if (!beginTransaction.getStatus().equals(TransactionStatus.ACTIVE)) {
					beginTransaction.commit();
				}
			} else if (ch == 3) {
				System.out.println("Enter usn");
				int sid = sc.nextInt();
				
				Student student = openSession.find(Student.class, sid);
				if (student != null) {
					System.out.println(student);
				} else {
					System.out.println("No data found");
				}
				
				if(!beginTransaction.getStatus().equals(TransactionStatus.ACTIVE)) {
					beginTransaction.commit();
				}
			}
			else if(ch == 4) {
				List list = openSession.createQuery("from Student").list();
				System.out.println(list);
			}
			else if(ch == 5) {
				System.out.println("exiting");
				break;
			}
		}
	}
}
