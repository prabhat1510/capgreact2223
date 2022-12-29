package day4.exercise;

import java.util.Scanner;

public class Factorials {
	
	public static void main(String[] args) {
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);
		while(keepGoing.equals("y") || keepGoing.equals("Y")){
			System.out.println("Enter an integer :");
			int val = scan.nextInt();
			System.out.println("Factorial ("+ val +")="+ MathUtils.factorial(val));
			System.out.println("Another Factorial? y/n ");
			keepGoing= scan.next();
		}

	}
}	
