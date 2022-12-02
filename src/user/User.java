package user;
import java.util.*;

import Data.SavedData;
import service.*;
public class User {
	public String email; 
	String userName;
	String passwrod;
	CreditCard myCrditCard;
	Wallet myWallet;
	Map<Integer,Service> completeServices;
	
	public User(String email,String userName,String password) {
		this.email = email;
		this.userName = userName;
		this.passwrod = password;
		myWallet = new Wallet();
		myCrditCard = new CreditCard();
		
	}

	public Wallet getMyWallet() {
		return myWallet;
	}
	public CreditCard getCard() {
		return myCrditCard;
	}	
	void addCompeleteServices(Service service) {
//		completeServices.add(service);
		
	}
//	searchService(){}
	
	void refund(Integer ID) {
		SavedData.getObj().refundServices.put(ID,Account.user);
		
	}
	
//	Discount[] showDiscounts(){}
	
	void addFundsToWallet(double amount) {}
}
