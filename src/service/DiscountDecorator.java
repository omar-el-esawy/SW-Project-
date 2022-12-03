package service;

import payment.PaymentFactory;
import provider.FactoryOfServiceProviderFactory;
import provider.ServiceProvider;
import provider.ServiceProviderFactory;
import user.Account;

public class DiscountDecorator extends ServiceDecorator{
    public DiscountDecorator(Service service) {
        super(service);
        
    }
    
    
    public void setDiscount(int discount) {
    	newDiscount =discount/100.0;
    	this.discount=newDiscount+super.getDiscounts();
    }
    
    
	@Override
	public String getName() {
		return service.name;
	}

    
    
    
   
    


}
