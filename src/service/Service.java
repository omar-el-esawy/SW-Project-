
package service;
import payment.*;

public abstract class Service {

    Payment payment=new CreditPayment();
    Double discount=0.0;
    String provider;
    void setPayment(Payment payment) {
        this.payment = payment;
    }
    public void setDiscount(int discount){
        this.discount+=discount/100.0;
    }
    void setProvider(String provider){
        this.provider=provider;
    }
    public Double getDiscounts(){
        return discount;
    }
    public void serve(Payment payment){
        setPayment(payment);
        setProvider("");
        setInfo();
        discount=getDiscounts();
        payment.pay(discount);

    }

    abstract public void setInfo();


}
