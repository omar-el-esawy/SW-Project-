package Data;
import user.*;

import java.util.*;
import service.*;

import service.InternetPaymentService;
import service.MobileRechargeService;
import service.Service;

public class SavedData {
	
	private SavedData() {
		services.put("Mobile Recharge", new MobileRechargeService());
		services.put("Internet Payment", new InternetPaymentService());
		services.put("Landline", new InternetPaymentService());
		services.put("Donation", new InternetPaymentService());
	}
	public Map<Integer,Service> getUsersCompleteService() {
		return usersCompleteService.get(Account.user.email);
	}
	void setUsersCompleteService(Map<Integer,Service> userCompliete) {
		usersCompleteService.put(Account.user.email,userCompliete);
	}
	public Map<String, User> userData = new HashMap<String, User>();

//	public Map<String,ArrayList<Service>> usersCompleteService = new HashMap<String,ArrayList<Service>>(); 
	public  Map<String, Map<Integer,Service>> usersCompleteService = new HashMap<String,Map<Integer,Service>>(); 

	public Map<String, Service> services = new HashMap<String, Service>();
	
	public Map<Integer,User> refundServices=new HashMap<Integer, User>();
	

	private static SavedData savedData = null;
	
	public static SavedData getObj(){
		if(savedData==null)savedData = new SavedData();
		
		return savedData;
	}
	
	
}
