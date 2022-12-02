package service;

import java.util.Scanner;

import payment.PaymentFactory;
import provider.DonationProviderFactory;
import provider.MobileProviderFactory;
import provider.ServiceProvider;
import provider.ServiceProviderFactory;

public class InternetPaymentService extends Service {

   @Override
	void setProvider() {
	   ServiceProviderFactory serviceProviderFactory =new MobileProviderFactory();
		System.out.println("Choose Your Provider:");
		System.out.println("Press 1. Etisalat");
		System.out.println("Press 2. Vodafone");
		System.out.println("Press 3. Orange");
		System.out.println("Press 4. WE");

		String  providerType = new Scanner(System.in).next();
		ServiceProvider serviceProvider= serviceProviderFactory.create(providerType);
	
		
	}
   
}
