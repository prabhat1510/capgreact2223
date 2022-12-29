package day3.operators;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int numberOne = 10;
		int numberTwo =3;
		
		int result;
		result = numberOne+numberTwo;
		System.out.println("Addition---"+result);
		result = numberOne-numberTwo;
		System.out.println("Subtraction---"+result);
		result = numberOne*numberTwo;
		System.out.println("Multiplication---"+result);
		
		result = numberOne/numberTwo;
		System.out.println("Division---"+result);
		
		result = numberOne%numberTwo;
		System.out.println("Modulus Divsion---"+result);
		System.out.println("***************************************");
		numberOne+=numberTwo;// numberOne= numberOne+numberTwo
		System.out.println("Addition---"+numberOne);
		numberOne-=numberTwo; // numberOne= numberOne-numberTwo
		System.out.println("Subtraction---"+numberOne);
		numberOne*=numberTwo;// numberOne= numberOne*numberTwo
		System.out.println("Multiplication---"+numberOne);
		numberOne/=numberTwo;// numberOne= numberOne/numberTwo
		System.out.println("Division---"+numberOne);
		numberOne%=numberTwo;// numberOne= numberOne%numberTwo
		System.out.println("Modulus Division---"+numberOne);

	}

}
