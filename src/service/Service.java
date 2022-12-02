
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
    boolean cash=false;
    
    public void setCash(boolean cash) {
		this.cash = cash;
	}
    public boolean getCash() {
			return cash;
	}
   
    void setPayment() {
 		Scanner cin = new Scanner(System.in);
		System.out.println("Choose Payment Way:");
		System.out.println("Press 1. Credit Card");
		System.out.println("Press 2. Wallet");
		if(getCash())
			System.out.println("Press 3. Cach");		
		String paymentType=cin.next();
		PaymentFactory paymentFactory=new PaymentFactory();
		this.payment=paymentFactory.create(paymentType);
    				
    	
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
