package service;

import java.util.Scanner;

import payment.PaymentFactory;
import provider.MobileProviderFactory;
import provider.ServiceProvider;
import provider.ServiceProviderFactory;

public class MobileRechargeService extends Service {	
	public MobileRechargeService()
	{
		name="MobileRechargeService";
		
	}
	@Override
	
	void setProvider() {
		   
		ServiceProviderFactory serviceProviderFactory =new MobileProviderFactory();
		ServiceProvider serviceProvider= serviceProviderFactory.create();
	

		
	}
    
   
}
