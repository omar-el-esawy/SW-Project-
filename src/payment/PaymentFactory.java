package payment;

import java.util.Scanner;

public class PaymentFactory {
	public Payment create(boolean cach) {
		
		
		System.out.println("Choose Payment Way:");
		System.out.println("Press 1. Credit Card");
		System.out.println("Press 2. Wallet");
		if(cach)
			System.out.println("Press 3. Cach");		
		String paymentType= new Scanner(System.in).next();
		
		if(paymentType.equals("1")) 
			return new CreditPayment();
		else if(paymentType.equals("2")) 
			return new WalletPayment();
		else if(paymentType.equals("3")) 
			return new CashPaymnet();
		 
		 else 
			 return null;
		
		}
}
