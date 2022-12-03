package service;

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
   
    


}
