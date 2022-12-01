package payment;

public class PaymentFactory {
	public Payment create(String paymentType) {
		
		if(paymentType.equals("1")) 
			return new CashPaymnet();
		else if(paymentType.equals("2")) 
			return new CreditPayment();
		else if(paymentType.equals("3")) 
				return new WalletPayment();
		 else 
			 return null;
		
		}
}
