package payment;

import java.util.Scanner;

import user.Account;

public class WalletPayment implements Payment{

	@Override
	public boolean pay(double discount) {
		System.out.println("Enter The Amount: ");
		double  amount= new Scanner(System.in).nextDouble();
		double amountAfterDiscounts = (1-discount)*amount;

		if(Account.user.getMyWallet().getBalance()>=amountAfterDiscounts) {
			
			System.out.println("You Will pay "+amountAfterDiscounts +" and 1LE Wallet Taxes" );
			Account.user.getMyWallet().spend(amountAfterDiscounts+1);
			return true;
		}
		else {
			System.out.println("There is not enough money");
			return false;

		}
	}

}
