package service;

import java.util.Scanner;

import payment.PaymentFactory;
import provider.InternetProviderFactory;
import provider.ServiceProvider;
import provider.ServiceProviderFactory;

public class InternetPaymentService extends Service {

   @Override
	void setProvider() {
	   ServiceProviderFactory serviceProviderFactory =new InternetProviderFactory();
		ServiceProvider serviceProvider= serviceProviderFactory.create();
	}
   
}
