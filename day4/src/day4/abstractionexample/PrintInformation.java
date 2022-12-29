package day4.abstractionexample;

//public class PrintInformation {
public abstract class PrintInformation {
	
	public PrintInformation() {
		// TODO Auto-generated constructor stub
	}

	public void printMessage() {
		System.out.println("I am inside abstract class PrintInformation");
	}
	
	public abstract void displayGreetings();
}
