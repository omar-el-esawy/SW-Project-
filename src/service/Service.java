
package service;
import java.util.Scanner;

import payment.*;

public abstract class Service {

	int id;
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
    Payment payment=new CreditPayment();
    Double discount=0.0;
    String provider;
    public boolean isRequestedToReFund; 
    
    
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
        this.discount+=discount/100.0;
    }
    public Double getDiscounts(){
        return discount;
    }
    
    public void serve(){
        setPayment();
        setProvider();
        discount=getDiscounts();
        payment.pay(discount);

    }




}
