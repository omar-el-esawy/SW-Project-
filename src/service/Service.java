
package service;
import java.util.Scanner;

import payment.*;
import user.Account;

public abstract class Service {
	public int id;
	public String name;
	public double cost;
	
	public Service (){
		id = 1; 
		cost =0 ; 
	}
	public int getId() {
		return id;
	}
	
    Payment payment=new CreditPayment();
    Double discount=0.0;
    String provider;    
    
    boolean cash=false;
    
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

    abstract void setProvider();

    public void setDiscount(int discount){
        this.discount=discount/100.0;
    }
    public Double getDiscounts(){
        return discount;
    }
    
    public void serve(){
        setPayment();
        setProvider();
        discount=getDiscounts();
        System.out.println(discount);
        cost = payment.pay(discount);
        
        if(cost!=-1) {
        	Account.user.addCompeleteServices(this);
        	id++;	
        }
        else 
        	cost =0;

    }




}
