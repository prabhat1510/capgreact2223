package firstjavaproject.interfaces;

public class PaymentMain {

	public static void main(String[] args) {
		NetBankingPayment nbp = new NetBankingPayment();
		Double amount = nbp.receiveDefaultPayment();
		Double amt = nbp.receivePayment();
		System.out.println("Default payment method--"+amount);
		System.out.println("Normal payment method--"+amt);
		Payment.receiveStaticPayment();
		//nbp.receiveDefaultPayment();
		Payment payment = new NetBankingPayment();
		Payment pmt = new BharatPePayment();
		UPIPayment upmt = new BharatPePayment();
	}

}
