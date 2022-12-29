package day4.exceptions;

import java.io.FileNotFoundException;

class ThrowDemo {
	
	void proc() throws FileNotFoundException,ArithmeticException {
		try {
			//Some logic is return 
			throw new FileNotFoundException ("From Exception");// Fielder has thrown
		}catch(FileNotFoundException e) {//Caught by wicketkeeper
			System.out.println("Caught inside demoproc.");
			throw e; // rethrow the exception // wicketkeeper throws 
		} 
	}

	public static void main(String args[]) {
		ThrowDemo t=new ThrowDemo();
		try {
			t.proc(); //Baller or method caller
		}catch(FileNotFoundException e) { //Finally caught by the baller
			System.out.println("Recaught: " + e);
		}
	}
}