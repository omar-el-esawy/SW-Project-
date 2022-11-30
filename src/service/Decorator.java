package service;

public abstract class Decorator extends Service{
    Service service;
    Decorator(Service service){
        this.service= service;
    }
    @Override
    public abstract Double getDiscounts();
    public abstract void setDiscount(int discount);



}
