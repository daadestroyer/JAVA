package prog2_LinkedList_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<EmployeeArrayList> empList = new ArrayList<EmployeeArrayList>();
		
		while(true) {
			System.out.println("1. add data");
			System.out.println("2. delete data");
			System.out.println("3. print data");
			System.out.println("4. total size");
			
			
			System.out.println("Enter choice");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.println("Enter id");
				int id = sc.nextInt();
				
				System.out.println("Enter name");
				String name = sc.next();
				
				System.out.println("Enter salary");
				String sal = sc.next();
				
				System.out.println("Enter city");
				String city = sc.next();
				
				EmployeeArrayList employeeArrayList = new EmployeeArrayList(id, name, sal, city);
				empList.add(employeeArrayList);
			}
			else if(ch == 2) {
				System.out.println("Enter id");
				int id = sc.nextInt();
				boolean flag = false;
				for (EmployeeArrayList employeeArrayList : empList) {
					if(employeeArrayList.getEid() == id) {
						empList.remove(employeeArrayList);
						flag = true;
						break;
					}
				}
				if(!flag) {
					System.out.println("not found");
				}
			}
			else if(ch == 3) {
				boolean flag = false;
				for (EmployeeArrayList employeeArrayList : empList) {
					System.out.println(employeeArrayList);
				}
				if(!flag) {
					System.out.println("not data found");
				}
			}
			else if(ch == 4) {
				System.out.println(empList.size());
			}
			else {
				System.out.println("exiting...");
				break;
			}
			
		}	
	}
}
