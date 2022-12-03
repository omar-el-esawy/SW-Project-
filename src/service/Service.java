
package service;
import java.util.Scanner;

import payment.*;
import provider.ServiceProvider;
import user.Account;

public abstract class Service {
	public int id;
	public String name;
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

    public abstract void setProvider();
    
    public ServiceProvider getProvider() {
		return provider;
	}
    
    public Payment getPayment() {
		return payment;
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
        System.out.println(discount);
        setCost(payment.pay(discount));        
        if(cost!=-1) {
        	Account.user.addCompeleteServices(this);
        	setId(id+1);	
        }
        else 
            setCost(0);        
        getInfo();

    }
    
    public void getInfo() {
    	System.out.println("Id: "+id);
    	System.out.println("Payment: "+payment.getName());
    	System.out.println("Provider: "+provider.getName());
    	System.out.println("Discounts: "+getDiscounts());
    	System.out.println("Cost: "+cost);

    }




}
