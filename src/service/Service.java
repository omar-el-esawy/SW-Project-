
package service;
import java.util.Scanner;

import payment.*;

public abstract class Service {
	static int idGenrator = 1;
	public int id;
	public String name;
	public Service (){
		this.id = idGenrator++;
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
