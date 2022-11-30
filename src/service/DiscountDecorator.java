package service;

public class DiscountDecorator extends Decorator{
    public DiscountDecorator(Service service) {
        super(service);
    }

    public Double getDiscounts() {
        return discount+service.getDiscounts();
    }


    public void setDiscount(int discount) {
        this.discount=discount/100.0;
    }

    public void setInfo() {
        service.setInfo();
    }

}
