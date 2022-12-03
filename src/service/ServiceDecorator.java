package service;

import payment.Payment;
import payment.PaymentFactory;
import provider.ServiceProvider;
import user.Account;

public abstract class ServiceDecorator extends Service{
    Service service;
    double newDiscount=0.0;
    
    ServiceDecorator(Service service){
        this.service= service;
        
    }
    
    @Override
    public int getId() {
		return this.service.getId();		
    }
    @Override
    public void setId(int id) {
		this.service.setId(id);
	}
    
   
    @Override
    public void setCash(boolean cash) {
		this.service.setCash(cash);
	}
    
    @Override
    public boolean getCash() {
			return this.service.getCash();
	}
    
    @Override
    void setPayment() {
		this.service.setPayment();		
    }
    
    @Override
    public Payment getPayment() {
		return this.service.getPayment();
	}
    
    @Override
     public void setProvider() {
    	 this.service.setProvider();
     }
    public ServiceProvider getProvider() {
		return this.service.getProvider();
	}
    
    @Override
    public String getName() {
    	
    	return this.service.getName();
    }
    
    @Override
    public void setDiscount(int discount){
    	this.service.setDiscount(discount);
    }
    
    @Override
    public Double getDiscounts() {
    	return this.service.getDiscounts();
    }
    
    @Override
    public void serve() {
		this.service.serve();
	}
    
    @Override
    public void getInfo() {
    	this.service.getInfo();

    }
    
    @Override
    public void setCost(double cost) {
    	this.service.setCost(cost);;
	}
    
    @Override
    public double getCost() {
		return this.service.getCost();
	}
    
    
   
   
    



}
