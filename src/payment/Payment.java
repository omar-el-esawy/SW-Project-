package payment;

public interface Payment {
	String getName();
	double getAmount();
	double pay(double amount) ;
	double getTaxes();
}
