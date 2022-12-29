package firstjavaproject.staticexample;

public class UseStatic {

	static int intNum1=3;
	static int intNum2;
	static {
			System.out.println("Static block intialized");
			intNum2= intNum1*4;
	}
	static void myMethod(int intNum3) {
		System.out.println("Number 3 = "+intNum3);
		System.out.println("Number 1 = "+intNum1);
		System.out.println("Number 2 = "+intNum2);
		
	}
	public static void main(String[] args) {
		myMethod(42);
	}

}
