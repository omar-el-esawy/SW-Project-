import java.util.*;
import user.*;
import Screen.*;
public class Main {
	static Scanner cin = new Scanner(System.in);
	static void userSteps() {
		while(true) {
			//doha zh2ttttt
			UI.loginOrSignUp();
			int option = cin.nextInt();
		if(option==2) {
			Register register = new Register();
			boolean success = false;
			while(!success) {
				
				System.out.println("Enter your user email and password");
				String email = cin.next(), user=cin.next(),password = cin.next();
				success = register.signUp(user,email,password);

				if(!success)System.out.println(" eamil or userName are used!, please try again");

			}
			
		}
		else if(option==1)
		{
			Account account = new Account();
			boolean success = false;
			while(!success) {
				
				System.out.println("Enter your email,and password");
				String email = cin.next(),password = cin.next();
				success = account.login(email, password);
				if(!success)System.out.println(" eamil or password not correct!, please try again");
				
			}
			while(true) {
				UI.userOptions();
				int userChoice=cin.nextInt();
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
