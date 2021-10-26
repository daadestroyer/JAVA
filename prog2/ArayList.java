package prog2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArayList {
	int id;
	String name;
	String course;

	ArayList(int id, String name, String course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public String toString() {
		return this.id + ":" + this.name + ":" + this.course;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<ArayList> aList = new ArrayList<ArayList>();

		while (true) {
			System.out.println("1. Add data to list");
			System.out.println("2. Size of list");
			System.out.println("3. print data");
			System.out.println("4. check list is empty or not");
			int ch = sc.nextInt();

			if (ch == 1) {
				System.out.println("Enter id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter course");
				String course = sc.next();
				aList.add(new ArayList(id, name, course));
			} else if (ch == 2) {
				System.out.println("------------------------");
				System.out.println("Size of list : "+aList.size());
				System.out.println("------------------------");
			} else if (ch == 3) {
				System.out.println("Student Data");
				System.out.println("-------------------------");
				for (ArayList arayList : aList) {
					System.out.println(arayList);
				}
				System.out.println("-------------------------");
			}
			else if(ch == 4) {
				System.out.println("------------------------");
				System.out.println("List is empty : "+aList.isEmpty());
				System.out.println("------------------------");
			}
		}
	}
}
