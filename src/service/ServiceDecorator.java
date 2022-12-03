package service;

import payment.PaymentFactory;
import user.Account;

public abstract class ServiceDecorator extends Service{
    Service service;
    double newDiscount=0.0;
    ServiceDecorator(Service service){
        this.service= service;
    }
    @Override
    public Double getDiscounts() {
    	return service.getDiscounts();
    }
    
    @Override
    public int getId() {
		return service.getId();		
    }
    
    @Override
    public void setCash(boolean cash) {
		service.setCash(cash);
	}
    
    @Override
    public boolean getCash() {
			return service.getCash();
	}
    
    @Override
    void setPayment() {
		service.setPayment();		
    }
    
    @Override
     void setProvider() {
    	 service.setProvider();
     }
    public void serve() {
		service.serve();
	}
   
    
    @Override
    public void setDiscount(int discount){
    	//service.setDiscount(discount);
    	newDiscount=discount/100.0;
    }



}
