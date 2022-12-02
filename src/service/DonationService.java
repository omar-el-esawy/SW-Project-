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
		ServiceProvider serviceProvider= serviceProviderFactory.create();
	}
   
}
