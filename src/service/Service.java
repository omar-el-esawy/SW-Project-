
package service;
import java.util.Scanner;

import payment.*;
import provider.FactoryOfServiceProviderFactory;
import provider.ServiceProvider;
import provider.ServiceProviderFactory;
import user.Account;

public abstract class Service {
	static public int id;
	public double cost;
	Payment payment=new CreditPayment();
    Double discount=0.0;
	ServiceProvider provider;    
	boolean cash=false;
	
	
	
	public Service (){
		id = 1; 
		cost =0 ; 
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
    public void setCash(boolean cash) {
		this.cash = cash;
	}
    
    public boolean getCash() {
			return cash;
	}
   
    void setPayment() {
		PaymentFactory paymentFactory=new PaymentFactory();
		this.payment=paymentFactory.create(getCash());
    				
    }

    public Payment getPayment() {
		return payment;
	}
    
    public void setProvider() {
    	FactoryOfServiceProviderFactory factoryOfServiceProviderFactory =new FactoryOfServiceProviderFactory();
    	ServiceProviderFactory serviceProviderFactory=factoryOfServiceProviderFactory.create(getName());
    	provider = serviceProviderFactory.create();
    }
    
    public ServiceProvider getProvider() {
		return provider;
	}
   
    
    public void setDiscount(int discount){
        this.discount=discount/100.0;
    }
    public Double getDiscounts(){
        return discount;
    }
    public void setCost(double cost) {
		this.cost = cost;
	}
    public double getCost() {
		return cost;
	}
    
    public void serve(){
        setPayment();
        setProvider();
        discount=getDiscounts();
        setCost(payment.pay(discount));        
        if(cost!=-1) {
        	Account.user.addCompeleteServices(this);
        	provider.setInfo(payment.getAmount());
        	getInfo();
        	setId(id+1);	
        }
        else 
            setCost(0);        

    }
    abstract public String getName();
    
    public void getInfo() {
    	System.out.println("Service Name: "+this.getName());
    	System.out.println("Service Id: "+id);
    	System.out.println("Payment Way: "+payment.getName());
    	System.out.println("Service Provider: "+provider.getName());
    	System.out.println("Discounts: "+getDiscounts()*100+"%");
    	System.out.println("Payment Taxes: "+payment.getTaxes()+"LE");
    	System.out.println("Service Total Cost: "+cost+"LE");
    }




}
