package prog1_generics;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList<Employee> empList = new LinkedList<Employee>();
		
		Scanner sc = new Scanner(System.in);
		 
		while(true) {
			System.out.println("1. add first");
			System.out.println("2. add last ");
			System.out.println("3. remove first");
			System.out.println("4. remove last");
			System.out.println("5. print data");
			
			System.out.println("Enter choice");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.println("Enter id");
				int eid = sc.nextInt();
				System.out.println("Enter name");
				String ename = sc.next();
				System.out.println("Enter city");
				String ecity = sc.next();
				System.out.println("Enter sal");
				String esal = sc.next();
				
				Employee newemp = new Employee(eid, ename, ecity, esal);
				
				empList.addFirst(newemp);
 			}
			else if(ch == 2) {
				System.out.println("Enter id");
				int eid = sc.nextInt();
				System.out.println("Enter name");
				String ename = sc.next();
				System.out.println("Enter city");
				String ecity = sc.next();
				System.out.println("Enter sal");
				String esal = sc.next();
				
				Employee newemp = new Employee(eid, ename, ecity, esal);
				
				empList.addLast(newemp);
			}
			else if(ch == 3) {
				System.out.println(empList.removeFirst());
				System.out.println(empList);
			}
			else if(ch == 4) {
				System.out.println(empList.removeLast());
				System.out.println(empList);
			}
			else if(ch == 5) {
				 
				for(int i=0 ; i<empList.size() ; i++) {
					System.out.println(empList.get(i));
				}
			}
			else {
				System.out.println("exiting");
				break;
			}
			
		}
	}
}
