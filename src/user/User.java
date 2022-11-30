package user;

public class User {
	String email; 
	String passwrod;
	CreditCard myCrditCard;
	Wallet myWallet;
	public User(String email,String password) {
		this.email = email;
		this.passwrod = password;
		myWallet = new Wallet();
		myCrditCard = new CreditCard();
	}
//	Services[] completeServices;
	
//	searchService(){}
	
	void refund(String ID) {}
	
//	Discount[] showDiscounts(){}
	
	void addFundsToWallet(double amount) {}
}
