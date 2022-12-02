package Data;
import user.*;

import java.util.*;

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
	public Map<String, User> userData = new HashMap<String, User>();
	public Map<String, Service> services = new HashMap<String, Service>();
	
	private static SavedData savedData = null;
	
	public static SavedData getObj(){
		if(savedData==null)savedData = new SavedData();
		
		return savedData;
	}
	
	
}
