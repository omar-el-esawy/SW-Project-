package admin;
import java.util.HashMap;
import java.util.Map;
import Data.SavedData;
import service.*;
import user.User;

public class Admin {
	
	
	void addService()
	{
		
	}
	void addDiscount()
	{
		
	}
	void showRefund()
	{
		//Map<Integer,User> refundServices
		for(Map.Entry<Integer,User> currentRefund:SavedData.getObj().refundServices.entrySet())
		{
			// id, user
			System.out.print(currentRefund.getKey()+" ");
			int Id=currentRefund.getKey();
			User user=currentRefund.getValue();
			SavedData obj=SavedData.getObj();
			Map<Integer,Service> current=obj.usersCompleteService.get(user.email);
			System.out.println(current.get(Id).name);
		}
	}
	void avaliablityCash(Service s)
	{
		
	}

}
