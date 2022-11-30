package user;

import Data.*;

public class Register {
	String email;
	SavedData saveData;
	public Register(){
		saveData = SavedData.getObj();
	}
	public boolean signUp(String userName,String email,String password) {
		
		if(!saveData.userData.containsKey(email) && !saveData.userData.containsKey(userName)) {
			User user = new User(email,password); 
			saveData.userData.put(email, user);
			saveData.userData.put(userName, user);
			return true;
		}
		else return false;
	}
	

	
}
