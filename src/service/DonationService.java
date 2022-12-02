package service;

import java.util.Scanner;

import payment.PaymentFactory;
import provider.DonationProviderFactory;
import provider.ServiceProvider;
import provider.ServiceProviderFactory;

public class DonationService extends Service {

@Override
	void setProvider() {
		ServiceProviderFactory serviceProviderFactory =new DonationProviderFactory();
		System.out.println("Choose Your Provider:");
		System.out.println("Press 1. Canser Hospitals");
		System.out.println("Press 2. Schools");
		System.out.println("Press 3. NGOs");
		String  providerType = new Scanner(System.in).next();
		ServiceProvider serviceProvider= serviceProviderFactory.create(providerType);
	}
   
}
