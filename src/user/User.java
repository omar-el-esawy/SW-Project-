package user;
import java.util.*;

import Data.SavedData;
import service.*;
public class User {
	String email; 
	String userName;
	String passwrod;
	CreditCard myCrditCard;
	Wallet myWallet;
	
	public User(String email,String userName,String password) {
		this.email = email;
		this.userName = userName;
		this.passwrod = password;
		myWallet = new Wallet();
		myCrditCard = new CreditCard();
		
	}

//	ArrayList<Service>
	 Map<String,Service> completeServices;
	public Wallet getMyWallet() {
		return myWallet;
	}
	public CreditCard getCard() {
		return myCrditCard;
	}
//	Services[] completeServices;
	
	void addCompeleteServices(Service service) {
//		completeServices.add(service);
		
		SavedData.getObj().usersCompleteService.put(userName,completeServices);
	}
//	searchService(){}
	
	void refund(String ID) {
		Service service;
		service = completeServices.get(ID);
		service.isRequestedToReFund = true;
		SavedData.getObj().usersCompleteService.put(userName,completeServices);

	}
	
//	Discount[] showDiscounts(){}
	
	void addFundsToWallet(double amount) {}
}
