package admin;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
	
	public void showRefund()
	{
		Scanner cin = new Scanner(System.in);
		//Map<Integer,User> refundServices
		SavedData obj=SavedData.getObj();
		for(Map.Entry<Integer,User> currentRefund:SavedData.getObj().refundServices.entrySet())
		{
			// id, user
			System.out.print(currentRefund.getKey()+" ");
			int Id=currentRefund.getKey();
			User user=currentRefund.getValue();
			Map<Integer,Service> current=obj.usersCompleteService.get(user.email);
			System.out.println(current.get(Id).name);
			
		}
		System.out.println("Choose service ");
		int id = cin.nextInt();
		System.out.println("1. Accept  or 2. reject ");
		int op = cin.nextInt();
		if(op==1) {
			User user= obj.refundServices.get(id);
			Map<Integer,Service> current=obj.usersCompleteService.get(user.email);
			user.getMyWallet().add(current.get(id).cost);
			obj.usersCompleteService.get(user.email).remove(id);
		}
		obj.refundServices.remove(id);
	}
	
	
	
	void avaliablityCash(Service s)
	{
		
	}

}
