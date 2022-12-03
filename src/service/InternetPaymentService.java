package service;

import java.util.Scanner;

import payment.PaymentFactory;
import provider.InternetProviderFactory;
import provider.ServiceProvider;
import provider.ServiceProviderFactory;

public class InternetPaymentService extends Service {
	
   @Override
   public String getName() {
   	
   	return "InternetPaymentService";
   }
   
   
}
