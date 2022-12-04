package payment;

import java.util.Scanner;

import user.Account;

public class CreditPayment implements Payment {
	@Override
	public double pay(double discount) {
		
		System.out.println("Enter The Amount: ");
		double  amount= new Scanner(System.in).nextDouble();
		while(amount<0.0) {
			System.out.println("Invalid Input!!");
			System.out.println("Enter The Amount Again: ");
			amount= new Scanner(System.in).nextDouble();
		}
		double amountAfterDiscounts = (1-discount)*amount;
		if(Account.user.getCard().getBalance()>=amountAfterDiscounts+getTaxes()) {
			Account.user.getCard().spend(amountAfterDiscounts+getTaxes());
			return amountAfterDiscounts+getTaxes();	
		}
		else {
			System.out.println("There is Not Enough Money");
			return -1;
		}
		
		
	}

	@Override
	public String getName() {
		return "CreditCardPayment";
		
	}

	@Override
	public double getTaxes() {
		return 5;
	}

}
