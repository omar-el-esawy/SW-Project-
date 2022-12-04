package payment;

import java.util.Scanner;

import user.Account;

public class WalletPayment implements Payment{
	
	public double amount=0.0;
	@Override
	public double pay(double discount) {
		System.out.println("Enter The Amount: ");
		amount= new Scanner(System.in).nextDouble();
		while(amount<0.0) {
			System.out.println("Invalid Input!!");
			System.out.println("Enter The Amount Again: ");
			amount= new Scanner(System.in).nextDouble();
		}
		double amountAfterDiscounts = (1-discount)*amount;
		if(Account.user.getMyWallet().getBalance()>=amountAfterDiscounts+getTaxes()) {
			Account.user.getMyWallet().spend(amountAfterDiscounts+getTaxes());
			return amountAfterDiscounts+getTaxes();
		}
		else {
			System.out.println("There is Not Enough Money");
			return -1;

		}
	}

	@Override
	public String getName() {
		return "WalletPayment";
		
	}

	@Override
	public double getTaxes() {
		return 1;
	}

	@Override
	public double getAmount() {
		return amount;
	}
}
