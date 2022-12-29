package day4.exceptions;

public class DefaultDemo {

	public static void main(String[] args) {
		String str = null;
		try {
			str.equals("Hello");
		}catch(NullPointerException npe) {
			System.out.println("Exception caught successfully");
		}finally {
			str ="World";
		}
		System.out.println(str);
	}

}
