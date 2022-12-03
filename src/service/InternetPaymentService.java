package service;

import java.util.Scanner;

import payment.PaymentFactory;
import provider.InternetProviderFactory;
import provider.ServiceProvider;
import provider.ServiceProviderFactory;

public class InternetPaymentService extends Service {
	public InternetPaymentService()
	{
		name="InternetPaymentService";
		
	}
   @Override
	public void setProvider() {
	   ServiceProviderFactory serviceProviderFactory =new InternetProviderFactory();
		provider= serviceProviderFactory.create();
	}
   
}
