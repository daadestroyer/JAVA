package prog2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkdList {
	int id;
	String name;
	String course;

	LinkdList(int id, String name, String course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public String toString() {
		return this.id + ":" + this.name + ":" + this.course;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<LinkdList> aList = new LinkedList<LinkdList>();

		while (true) {
			System.out.println("1. add data to linkedlist");
			System.out.println("2. add data to last");
			System.out.println("3. add data to first");
			System.out.println("4. remove data from first");
			System.out.println("5. remove data from last");
			
			
			int ch = sc.nextInt();

			if (ch == 1) {
				System.out.println("Enter id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter course");
				String course = sc.next();
				aList.add(new LinkdList(id, name, course));
			} else if (ch == 2) {
				System.out.println("Enter id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter course");
				String course = sc.next();
				aList.addLast(new LinkdList(id, name, course));
			} else if (ch == 3) {
				System.out.println("Enter id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter course");
				String course = sc.next();
				aList.addFirst(new LinkdList(id, name, course));
			}
			else if(ch == 4) {
				aList.removeFirst();
				System.out.println("Student Data");
				System.out.println("-------------------------");
				for (LinkdList linkdList : aList) {
					System.out.println(linkdList);
				}
				System.out.println("-------------------------");
			}
			else if(ch == 5) {
				aList.removeLast();
				System.out.println("Student Data");
				System.out.println("-------------------------");
				for (LinkdList linkdList : aList) {
					System.out.println(linkdList);
				}
				System.out.println("-------------------------");
			}
		}
	}
}
