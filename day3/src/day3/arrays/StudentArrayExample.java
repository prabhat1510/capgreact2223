package day3.arrays;

public class StudentArrayExample {

	public static void main(String[] args) {
		Student student = new Student();
		//Array of student object
		Student[] studentArr = new Student[5];
		
		studentArr[0] = new Student(1,"Vishnu","HYD");
		studentArr[1] = new Student(2,"Suman","CHN");
		studentArr[2] = new Student(3,"Pavithra","CHTR");
		studentArr[3] = new Student(4,"Dubey","SLTP");
		studentArr[4] = new Student(5,"Byresha","BLR");
		//studentArr[5] = new Student(6,"Abhay","PUN");
		int length =studentArr.length;
		for(int index=0;index<length;index++) {
			System.out.println(studentArr[index]);
		}
		System.out.println("***********************");
		//System.out.println(studentArr[5]);
		System.out.println(studentArr[3]);
	}

}
