package user;

import Data.*;

public class Register {
	String email;
	SavedData saveData;
	public Register(){
		saveData = SavedData.getObj();
	}
	public boolean signUp(String username,String email,String password) {
		
		if(!saveData.userData.containsKey(username) && !saveData.userData.containsKey(email)) {
			User user = new User(email,password); 
			saveData.userData.put(username, user);
			saveData.userData.put(email, user);
			return true;
		}
		else return false;
	}
}
