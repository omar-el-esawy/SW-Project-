
package service;
import payment.*;

public abstract class Service {

    Payment payment=new CreditPayment();
    Double discount=0.0;
    String provider;
    public boolean isRequestedToReFund; 
    
    abstract void setPayment();
    abstract void setProvider();

    public void setDiscount(int discount){
        this.discount+=discount/100.0;
    }
    public Double getDiscounts(){
        return discount;
    }
    
    public void serve(Payment payment){
        setPayment();
        setProvider();
        discount=getDiscounts();
        payment.pay(discount);

    }




}
