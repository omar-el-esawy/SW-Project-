package service;

import user.Account;

public class DiscountDecorator extends ServiceDecorator{
    public DiscountDecorator(Service service) {
        super(service);
    }
    

    public Double getDiscounts() {
        return newDiscount+service.getDiscounts();
    }



}
