package provider;

import java.util.Scanner;

public class LandlineProviderFactory implements ServiceProviderFactory{
	@Override
	public ServiceProvider create() {
		System.out.println("Choose Your Provider:");
		System.out.println("Press 1. Monthly Reciept Landline");
		System.out.println("Press 2. Quarter Reciept Landline");
		String  providerType = new Scanner(System.in).next();
		
		if(providerType.equals("1"))
			return new MonthlyReceiptLandline();
		else if(providerType.equals("2"))
			return new QuarterReceiptLandline();
		
		return null;
	}
}
