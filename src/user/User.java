package user;
import java.util.*;

import Data.SavedData;
import service.*;
public class User {
	public String email; 
	public String userName;
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
		myCrditCard.add(1000);
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
	public void showRefunds() {
		for(Map.Entry<Integer,Service> current :completeServices.entrySet()) {
			 System.out.println("ID:"+current.getKey()+ "\t Service Name: "  + current.getValue().getName() );
		}
		System.out.println("Enter service's ID : ");
	}
	public boolean refund(Integer ID) {	
		if(!completeServices.containsKey(ID)) {
			System.out.println("Invalid service !");
			return false;
		}
		SavedData.getObj().refundServices.put(ID,Account.user);
		System.out.println("Your request is pending... ");
		return true;
	}
	public void addMoneyToWallet(double amount) {
		if(myCrditCard.balance>=amount) {
			myCrditCard.balance-=amount;
			myWallet.balance+=amount;
			System.out.println("Done Successfully..");

		}else
			System.out.println("There is not money..");
	}
	public void showDiscounts() {
		int noDiscounts=0;
			for(Map.Entry<String,Service> service :SavedData.getObj().services.entrySet()) {
				System.out.println(service.getKey()+": "+service.getValue().getDiscounts()*100+"%");
				if(service.getValue().getDiscounts()!=0.0)
					noDiscounts++;
			}
			if(noDiscounts==0)
				System.out.println("There is no discounts..");
			
	}
}
