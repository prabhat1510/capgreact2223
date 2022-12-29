package day4.abstractionexample;

public class PrintMessageMain {

	public static void main(String[] args) {
		PrintNewYearMessage pnym = new PrintNewYearMessage();
		pnym.printMessage();
		pnym.displayInfo();
		pnym.displayGreetings();
		
		//Abstract class PrintInformation
		PrintInformation pi = new PrintInformation() {
			
			@Override
			public void displayGreetings() {
				// TODO Auto-generated method stub
				
			}
		}; 
		
		pi.displayGreetings();
		//Without extending abstract class we are accessing the non abstract method
		pi.printMessage();

	}

}
