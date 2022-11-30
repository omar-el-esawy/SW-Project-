package user;

import Data.*;

public class Register {
	String email;
	SavedData saveData;
	public Register(){
		saveData = SavedData.getObj();
	}
	public boolean signUp(String userName,String email,String password) {
		
		if(!saveData.userData.containsKey(email)) {
			User user = new User(email,password); 
			saveData.userData.put(email, user);
			return true;
		}
		else return false;
	}
	
	/*public boolean login(String email,String password)
	{
		if(saveData.savedAccounts.containsKey(email)&&(saveData.savedAccounts.get(email)).equals(password))
		{
		
			return true;
		}
		else return false;
		
	}*/
	
}
