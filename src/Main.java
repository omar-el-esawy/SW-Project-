import java.util.*;

import Data.SavedData;
import Screen.Invoker;
import Screen.Login;
import Screen.Register;
import Screen.UI;
import admin.Admin;
import service.*;
import user.Account;
import user.User;


public class Main {
	static Scanner cin = new Scanner(System.in);
	static void userSteps(){
		while(true) {
			UI.loginOrSignUp();
			int option = cin.nextInt();
			Invoker invoker=new Invoker();
			if(option==2) {
				boolean success = false;
				while(!success) {
					System.out.println("Enter your user email and password");
					String email = cin.next(), user=cin.next(),password = cin.next();
					Account account=new Account(user,email,password);
					invoker.setCommand(new Register(account));
					success=invoker.doAction();
					if(!success)System.out.println(" eamil or userName are used!, please try again");
			}	
				}
			else if(option==1)
			{
				boolean success = false;
				while(!success) {
					System.out.println("Enter your email,and password");
					String email_userName = cin.next(),password = cin.next();
					Account account=new Account(email_userName,email_userName,password);
					invoker.setCommand(new Login(account));
					success = invoker.doAction();
					if(!success)System.out.println(" eamil or password not correct!, please try again");
				}
				while(true) {
					System.out.println("Name: " + Account.user.userName + "\t\t balance: "+Account.user.getMyWallet().getBalance()); 
					UI.userOptions();
					int userChoice=cin.nextInt();
					if(userChoice==1) {
						Account.user.getMyWallet().add(20);
						SavedData.getObj().services.get("MobileRecharge").serve();
						//Search.showSearchResult("Mobile");
					}
					else if(userChoice ==2) {
						Account.user.showRefunds();
						int id = cin.nextInt();
						Account.user.refund(id);
					}
					else if(userChoice==5)appSteps();
					else 
						System.out.println("Invalid input, You should choose from user's options!");
					
				}
				

			}
			else 
				System.out.println("Invalid input, You should choose from user's options! ");
			
		}	
	}
	
	static void adminSteps() {
		while(true) {
			UI.adminOptions();
			int adminChoice=cin.nextInt();
			if(adminChoice==4)appSteps();
			else if(adminChoice ==2 ) {
				Admin admin = new Admin();
				admin.showRefund();
			}else if(adminChoice==1) {
				Admin admin = new Admin();
				admin.addDiscount();
			}
			else if(adminChoice==3) {
				Admin admin = new Admin();
				admin.avaliablityCash();
			}
			else 
				System.out.println("Invalid input, You should choose from admin's options! ");
			}
		
	}
	static void appSteps() {
		while(true) {
			
		UI.home();
		int userOrAdmin=cin.nextInt();
		
		if(userOrAdmin==1)
			userSteps();
		else if(userOrAdmin==2)
			adminSteps();	
		else 
			System.out.println("Invalid input, You should choose from user or admin! ");
		}
	}
	
	public static void main(String[] args) {
		User user = new User("d","doha","123");
		SavedData.getObj().userData.put("d",user);
		appSteps();
		
		
	}

}
