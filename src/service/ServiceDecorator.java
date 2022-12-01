package service;

public abstract class ServiceDecorator extends Service{
    Service service;
    ServiceDecorator(Service service){
        this.service= service;
    }
    @Override
    public abstract Double getDiscounts();
    public abstract void setDiscount(int discount);



}
