package firstjavaproject.enums;

public class ColorMain {

	public static void main(String[] args) {
		Color c;
		c=Color.red;
		System.out.println(c);
		System.out.println(Color.values());
		System.out.println(Color.valueOf("red"));
	}

}
