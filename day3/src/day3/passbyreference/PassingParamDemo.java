package day3.passbyreference;

public class PassingParamDemo {

	public static void changeColor(Apple apple) {
		//apple = new Apple();
		apple.color="red";
	}
	public static void main(String[] args) {
		Apple apple = new Apple();
		System.out.println("color : "+apple.color);
		changeColor(apple);
		System.out.println("color : "+apple.color);
	}

}
