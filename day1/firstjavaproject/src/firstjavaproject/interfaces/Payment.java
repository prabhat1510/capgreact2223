package firstjavaproject.interfaces;

public interface Payment {
	   public final Double totalAmount=1555.50;
		//Abstract method
		public Double receivePayment();
		
		//default keyword was introduce in Java 1.8 using this keyword you can have default implementation of a method 
		public default Double receiveDefaultPayment() {
			return 155.50;
		}
		//static keyword also introduces in Java 1.8
		public static Double receiveStaticPayment() {
			return 55.60;
		}
}
