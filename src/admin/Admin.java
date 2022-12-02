package admin;
import java.util.HashMap;
import java.util.Map;

import Data.SavedData;
import service.*;

public class Admin {
	void addService()
	{
		
	}
	void addDiscount()
	{
		
	}
	void showRefund()
	{
		Map<String, Map<String,Service>> doha = new HashMap<String,Map<String,Service>>();
		for(Map.Entry<String, Map<String,Service>> v : doha.entrySet()) {
			for(Map.Entry<String,Service> s : v.getValue().entrySet()) {
				if(s.getValue().isRequestedToReFund)System.out.println("550");
			}
		}
	}
	void avaliablityCash(Service s)
	{
		
	}

}
