import java.util.*;
import user.*;
public class Main {
	static Scanner cin = new Scanner(System.in);
	static int home()
	{
		System.out.println("Press 1. User");
		System.out.println("Press 2. Admin");
		int userOrAdmin=cin.nextInt();
		return userOrAdmin;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner cin = new Scanner(System.in);
		if(home()==1)
		{
			while(true) {
				//doha zh2ttttt
				System.out.println("Press 1. to Log In");
				System.out.println("Press 2. to Sign Up");
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
					Register register = new Register();
					boolean success = false;
					while(!success) {
						
						System.out.println("Enter your email,and password");
						String email = cin.next(),password = cin.next();
						if(!success)System.out.println(" eamil or password not correct!, please try again");
						
				}
					System.out.println("Press 1. searchService");
					System.out.println("Press 2. refund");
					System.out.println("Press 3. showDiscounts");
					System.out.println("Press 4. addFundsToWallet");
					int userChoice=cin.nextInt();

			}

			}	
		}
		else
		{
			System.out.println("Press 1. addService");
			System.out.println("Press 2. addDiscount");
			System.out.println("Press 3. showRefund");
			System.out.println("Press 4. avaliablityCash");
			
			int adminChoice=cin.nextInt();
			
		}
		
	}

}
