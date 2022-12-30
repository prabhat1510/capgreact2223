package day5.stringexample;

public class StringExample {

	public static void main(String[] args) {
		// In English String - group of characters
		// In Java String is an object that represents sequence of char values. 
		//An array of character.
		char[] c = { 'H', 'e', 'l', 'l', 'o' };
		// String is handled as an object of class String and not as an array of characters
		String str = new String(c);
		String s = "Hello";//s is referring to a new object whose value is "Hello"
		if("hello" instanceof String) {
			System.out.println(true);
		}
		System.out.println(s);
		s="Hi";//s is now referring to a new object whose value is "Hi"
		System.out.println(s);
		
	}
}
