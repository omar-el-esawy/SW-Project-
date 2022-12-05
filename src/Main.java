import java.util.*;

import Data.NameServicePair;
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
	public static void main(String[] args) {
		User user = new User("d","doha","123");
		SavedData.getObj().getUserData().put("d",user);
		UI.appSteps();
		
		
	}

}
