package day5.stringexample;

public class StringOperations {

	public static void main(String[] args) {
		// new String("Core") - that means new object will be created in the String pool
		String str = "Core";
		String s = "Core";
		String s2 = new String("Core");
		
		System.out.println(s2.hashCode());
		System.out.println(s.hashCode());
		System.out.println(str.hashCode());
		s="Hi";
		System.out.println("s---"+s.hashCode());
		//Its creating new string object referred by s1.
		String s1 =s.replace('i', 'a');
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}
