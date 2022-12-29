package day3.casting;

public class TypeCastExample {

	public static void main(String[] args) {
		int a=9;
		float b;
		System.out.println(a);
		b=a;
		System.out.println(b);
		//a=b;
		
		int i = (int) (5.6/2);
		System.out.println(i);
		System.out.println("**********************");
		System.out.println(Math.round(5.6/2));
		System.out.println(Math.floor(5.6/2));
		System.out.println(Math.ceil(5.6/2));
		
		int ii = 125; 
		byte bb;
		bb = (byte) ii;
		System.out.println(bb);
		
		int num = 0;
		System.out.println(num);
	}

}
