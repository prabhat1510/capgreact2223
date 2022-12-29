package day4.abstractionexample;

public class PrintNewYearMessage extends PrintInformation implements VisualInfo{
	public void printMessage() {
		System.out.println("I am inside abstract class PrintInformation - Wish You All Happy New Year !!");
	}

	@Override
	public void displayInfo() {
		System.out.println("Info is displayed");
		
	}

	@Override
	public void displayGreetings() {
		System.out.println("I am display greetings method");
		
	}
}
