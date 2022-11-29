package user;

import Data.*;

public class Register {
	String email;
	SavedData saveData;
	public Register(){
		saveData = SavedData.getObj();
	}
	public boolean SignUp(String username,String email,String password) {
		
		if(!saveData.userData.containsKey(username) && !saveData.userData.containsKey(email)) {
			
			saveData.userData.put(username, password);
			saveData.userData.put(email, password);
			return true;
		}
		else return false;
	}
}
