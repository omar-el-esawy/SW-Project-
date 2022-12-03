package payment;

import java.util.Scanner;

import user.Account;
import user.CreditCard;

public class CreditPayment implements Payment {
	@Override
	public double pay(double discount) {
		
		System.out.println("Enter The Amount: ");
		double  amount= new Scanner(System.in).nextDouble();
		double amountAfterDiscounts = (1-discount)*amount;
		System.out.println("*******************************************"+discount);
		if(Account.user.getCard().getBalance()>=amountAfterDiscounts+5) {
			System.out.println("You Will pay "+amountAfterDiscounts +" and 5LE Credit Card Taxes" );
			Account.user.getCard().spend(amountAfterDiscounts+5);
			return amountAfterDiscounts+5;	
		}
		else {
			System.out.println("There is not enough money");
			return -1;
		}
		
		
	}

}
