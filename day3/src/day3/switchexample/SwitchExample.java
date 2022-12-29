package day3.switchexample;

public class SwitchExample {
	public static void main(String[] args) {

		for (int i = 0; i <= 3; i++)
			switch (i) {
			case 0:
				System.out.println("i is zero");
				break;
			case 1:
				System.out.println("i is one");
				break;
			case 2:
				System.out.println("i is two");
				break;
			default:
				System.out.println("i is greater than 2.");
			}

	}
}
