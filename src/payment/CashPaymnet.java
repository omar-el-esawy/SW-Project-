package payment;

import java.util.Scanner;

public class CashPaymnet implements Payment{

	@Override
	public double pay(double discount) {
		System.out.println("Enter The Amount: ");
		double  amount= new Scanner(System.in).nextDouble();
		double amountAfterDiscounts = (1-discount)*amount;
		System.out.println("You Will pay "+amountAfterDiscounts);
		return amountAfterDiscounts;
	}

}
