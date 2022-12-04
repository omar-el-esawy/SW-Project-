package Data;
import user.*;

import java.util.*;

import provider.ServiceProvider;
import service.*;

import service.InternetPaymentService;
import service.MobileRechargeService;
import service.Service;

public class SavedData {
	
	public static SavedData getObj(){
		if(savedData==null)savedData = new SavedData();
		
		return savedData;
	}
	
	private SavedData() {
		services.put("MobileRecharge", new MobileRechargeService());
		services.put("InternetPayment", new InternetPaymentService());
		services.put("Landline", new LandlineService());
		services.put("Donation", new DonationService());
	}
	
	public Map<Integer,ServiceStatePair> getUsersCompleteService() {
		return usersCompleteService.get(Account.user.email);
	}
	
	public void setUsersCompleteService(Map<Integer,ServiceStatePair> userCompliete) {
		usersCompleteService.put(Account.user.email,userCompliete);
	}
	public Map<String, User> userData = new HashMap<String, User>();

	public  Map<String, Map<Integer,ServiceStatePair>> usersCompleteService = new HashMap<String,Map<Integer,ServiceStatePair>>(); 

	public Map<String, Service> services = new HashMap<String, Service>();
	
	public Map<Integer,User> refundServices=new HashMap<Integer, User>();
	
	public Map<Integer,ServiceProvider> providers=new HashMap<Integer, ServiceProvider>();

	
	private static SavedData savedData = null;
	
}
