package firstjavaproject.staticexample;

public class StaticExample {
	static final Integer minBalance =15555555;
	public static void main(String[] args) {
		displayInfo();
		System.out.println(StaticExample.minBalance);
		StaticExample se = new StaticExample();
		se.display();
		
		

	}
	
	public static void displayInfo() {
		System.out.println("PLease wake up");
	}
	
	public void display() {
		displayInfo();
		System.out.println("Thank God No girls in class");
	}

}
