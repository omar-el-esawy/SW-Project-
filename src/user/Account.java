package user;

import Data.SavedData;

public class Account {
	String userEmail;
	String password;
	SavedData saveData;
	User user; 
	public Account(){
		saveData = SavedData.getObj();
	}
	public boolean login(String userOrEmail,String password)
	{
		
		if(saveData.userData.containsKey(userOrEmail))
		{
			user = saveData.userData.get(userOrEmail) ;
			
			if(user.passwrod.equals(password))
				return true;
			else 
				return false;
		}
		else return false;
		
	}
}
