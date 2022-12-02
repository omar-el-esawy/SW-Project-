package payment;

import java.util.Scanner;

import user.Account;
import user.CreditCard;

public class CreditPayment implements Payment {

	@Override
	public boolean pay(double discount) {
		
		System.out.println("Enter The Amount: ");
		double  amount= new Scanner(System.in).nextDouble();
		double amountAfterDiscounts = (1-discount)*amount;
		if(Account.user.getCard().getBalance()>=amountAfterDiscounts) {
			System.out.println("You Will pay "+amountAfterDiscounts +" and 5LE Credit Card Taxes" );
			Account.user.getCard().spend(amountAfterDiscounts);
			return true;	
		}
		else {
			System.out.println("There is not enough money");
			return false;
		}
		
		
	}

}
