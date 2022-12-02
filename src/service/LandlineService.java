package service;

import java.util.Scanner;

import payment.PaymentFactory;
import provider.LandlineProviderFactory;
import provider.MobileProviderFactory;
import provider.ServiceProvider;
import provider.ServiceProviderFactory;

public class LandlineService extends Service {
	
  @Override
	void setProvider() {
	  ServiceProviderFactory serviceProviderFactory =new LandlineProviderFactory();
		System.out.println("Choose Your Provider:");
		System.out.println("Press 1. Monthly Reciept Landline");
		System.out.println("Press 2. Quarter Reciept Landline");
		String  providerType = new Scanner(System.in).next();
		ServiceProvider serviceProvider= serviceProviderFactory.create(providerType);
		
		
	}
}
