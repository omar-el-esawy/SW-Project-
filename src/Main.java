import java.util.*;

import Data.SavedData;
import Screen.Invoker;
import Screen.Login;
import Screen.Register;
import Screen.UI;
import service.Service;
import service.ServiceFactory;
import user.Account;

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
					UI.userOptions();
					int userChoice=cin.nextInt();
					if(userChoice==1) {
						//ServiceFactory serviceFactory =new ServiceFactory();
						//System.out.println(Account.user.getMyWallet().getBalance());
						//Account.user.getMyWallet().add(20);
						//System.out.println(Account.user.getMyWallet().getBalance());
						SavedData.getObj().services.get("Mobile Recharge").serve();;
					}
					if(userChoice==5)appSteps();
				}
				

			}
		}	
	}
	static void appSteps() {
		UI.home();
		int userOrAdmin=cin.nextInt();
		
		if(userOrAdmin==1)
		{
			userSteps();
		}
		else
		{
			while(true) {
				UI.adminOptions();
				int adminChoice=cin.nextInt();
				if(adminChoice==5)appSteps();
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		appSteps();
		
		
	}

}
