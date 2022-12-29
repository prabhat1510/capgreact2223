package firstjavaproject.assignment;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[4];
		for(int index=0; index<students.length;index++) {
			int id =scanner.nextInt();   
			String fname=scanner.next();
			double cgpa = scanner.nextDouble();
			Student student = new Student(id,fname,cgpa);
			//read input from console
			
			students[index] =student; 
		}
	}

}
