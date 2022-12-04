package Screen;

public class UI {

	public static void home()
	{
		System.out.println("Press 1. User");
		System.out.println("Press 2. Admin");

	}
	
	public static void loginOrSignUp() {
		System.out.println("Press 1. to Log In");
		System.out.println("Press 2. to Sign Up");
	}
	
	public static void userOptions() {
		System.out.println("Press 1. searchService");
		System.out.println("Press 2. refund");
		System.out.println("Press 3. showDiscounts");
		System.out.println("Press 4. addFundsToWallet");
		System.out.println("press 5. To exit");
	}
	
	public static void adminOptions() {
		System.out.println("Press 1. addDiscount");
		System.out.println("Press 2. showRefund");
		System.out.println("Press 3. CashAvaliablity");
		System.out.println("press 4. To exit");
	}
	
	public static void servicesOptions() {
		System.out.println("MobileRecharge");
		System.out.println("InternetPayment");
		System.out.println("Landline");
		System.out.println("Donation");
		//System.out.println("All");
	}
	
	
}
