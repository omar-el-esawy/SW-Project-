import java.util.*;
import user.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(true) {
				
			System.out.println("Press 1. to Log In");
			System.out.println("Press 2. to Sign Up");
			int option = cin.nextInt();
			if(option==2) {
				Register register = new Register();
				boolean success = false;
				while(!success) {
					
					System.out.println("Enter your email,username and password");
					String email = cin.next(),username = cin.next(),password = cin.next();
					success = register.SignUp(username,email,password);

					if(!success)System.out.println("username or eamil are used!, please try again");

				}
				
			}

		}

	}

}
