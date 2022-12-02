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
		ServiceProvider serviceProvider= serviceProviderFactory.create();
		
		
	}
}
