public class Generics {

	String state;
	String capital;
	
	TreeMap<String, String> tm = new TreeMap<String, String>();
	
	public void setData(String state , String capital) {
			tm.put(state, capital);
	}
	
	public void getData() {
		System.out.println("State :\t Capital");
		System.out.println("--------------------");
		for(Map.Entry<String, String> word : tm.entrySet()) {
			System.out.println(word.getKey() +":"+word.getValue());
		}
		System.out.println("---------------------");
	}
	
	public void searchData(String key) {
		if(tm.containsKey(key)) {
			System.out.println("---------------------");
			System.out.println("THE KEY IS PRESENT");
			System.out.println("---------------------");
		}
		else {
			System.out.println("---------------------");
			System.out.println("THE KEY IS NOT PRESENT");
			System.out.println("---------------------");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Generics generics = new Generics();
		
		while(true) {
			System.out.println("1. Adding Element");
			System.out.println("2. Search key");
			System.out.println("3. Display Data");
			System.out.println("4. Exit");
			
			int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.println("Enter state");
				String state = sc.next();
				
				System.out.println("Enter capital");
				String capital = sc.next();
				
				
				generics.setData(state, capital);
			}
			else if(ch == 2) {
				System.out.println("Enter key to search");
				String key = sc.next();
				generics.searchData(key);
			}
			else if(ch == 3) {
				generics.getData();
			}
			else if(ch == 4) {
				System.out.println("EXITING...");
				break;
			}
			else {
				System.out.println("WRONG CHOICE...");
			}
		}
	}

}
