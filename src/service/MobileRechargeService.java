package service;

import java.util.Scanner;

import payment.PaymentFactory;
import provider.MobileProviderFactory;
import provider.ServiceProvider;
import provider.ServiceProviderFactory;

public class MobileRechargeService extends Service {	
	@Override
	void setProvider() {
		   
		ServiceProviderFactory serviceProviderFactory =new MobileProviderFactory();
		System.out.println("Choose Your Service Provider:");
		System.out.println("Press 1. Etisalat");
		System.out.println("Press 2. Vodafone");
		System.out.println("Press 3. WE");
		System.out.println("Press 4. Orange");
		String  providerType = new Scanner(System.in).next();
		ServiceProvider serviceProvider= serviceProviderFactory.create(providerType);
	

		
	}
    
   
}
