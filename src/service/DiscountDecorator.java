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
    

    public Double getDiscounts() {
    	
        return this.discount;
    }
    
    public void setDiscount(int discount) {
    	newDiscount =discount/100.0;
    	this.discount=newDiscount+super.getDiscounts();
    }
    
    @Override
    void setPayment() {
    	PaymentFactory paymentFactory=new PaymentFactory();
		this.payment=paymentFactory.create(getCash());
    }
    
    @Override
	public ServiceProvider getProvider() {
    	this.provider=service.getProvider();
		return this.provider;
	}
    
    @Override
    public void setId(int id) {
    	this.id=service.id;
    }
    @Override
    public void setCash(boolean cash) {
    	
    	this.cash=cash;
    }
    @Override
    public boolean getCash() {
    	return this.cash;
    }
    @Override
    public void setCost(double cost) {
    	this.cost=cost;
    }
    @Override
    public void setProvider() {
    	FactoryOfServiceProviderFactory factoryOfServiceProviderFactory =new FactoryOfServiceProviderFactory();
    	ServiceProviderFactory serviceProviderFactory=factoryOfServiceProviderFactory.create(service.getName());
    	this.provider = serviceProviderFactory.create();
    }
    public void serve(){
        this.setPayment();
        this.setProvider();
        discount=this.getDiscounts();
        System.out.println(discount);
        setCost(payment.pay(discount));        
        if(cost!=-1) {
        	Account.user.addCompeleteServices(this);
        	this.setId(id+1);	
        }
        else 
            setCost(0);        
        this.getInfo();

    }
    public void getInfo() {
    	System.out.println("Id: "+id);
    	System.out.println("Payment: "+this.payment.getName());
    	System.out.println("Provider: "+this.provider.getName());
    	System.out.println("Discounts: "+this.getDiscounts());
    	System.out.println("Cost: "+this.cost);
    	System.out.println("Cash: "+this.getCash());
    	System.out.println("Name: "+this.getName());
    }

    
    
    
   
    


}
