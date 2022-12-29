package day4.exercise;

import java.util.Scanner;

public class ParseInts {

	public static void main(String[] args) {

		int val = 0;

		int sum = 0;

		Scanner sc = new Scanner(System.in);

		String line;

		System.out.println("Enter a line of text");

		Scanner scan = new Scanner(sc.nextLine());

		while (scan.hasNext()) {

			val = Integer.parseInt(scan.next());

			sum += val;

		}

		System.out.println("The sum of the integers on this line is " + sum);

	}

}
