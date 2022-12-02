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
		completeServices = new HashMap<Integer,Service>();
	}

	public Wallet getMyWallet() {
		return myWallet;
	}
	public CreditCard getCard() {
		return myCrditCard;
	}	
	public void addCompeleteServices(Service service) {
		completeServices.put(service.id, service);
		SavedData.getObj().setUsersCompleteService(completeServices);
	}
//	searchService(){}
	public void showRefunds() {
		for(Map.Entry<Integer,Service> current :completeServices.entrySet()) {
			 System.out.println(current.getKey()+ " "  + current.getValue().name );
		}
	}
	public void refund(Integer ID) {
		
		SavedData.getObj().refundServices.put(ID,Account.user);
		System.out.println("Your request is pending... ");
	}
	
//	Discount[] showDiscounts(){}
	
	void addFundsToWallet(double amount) {}
}
