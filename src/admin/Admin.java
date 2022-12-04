package admin;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import Data.SavedData;
import Data.ServiceStatePair;
import Screen.UI;
import discount.Discount;
import discount.DiscountFactory;
import service.*;
import user.User;
public class Admin {
	Discount discount;
	public void addDiscount()
	{
		DiscountFactory discountFactory=new DiscountFactory();
		discount=discountFactory.create();
		discount.addDiscount();
	}
	
	public void showRefund()
	{
		Scanner cin = new Scanner(System.in);
		SavedData obj=SavedData.getObj();
		for(Map.Entry<Integer,User> currentRefund:SavedData.getObj().refundServices.entrySet())
		{
			System.out.print(currentRefund.getKey()+" ");
			int Id=currentRefund.getKey();
			User user=currentRefund.getValue();
			Map<Integer,ServiceStatePair> current=obj.usersCompleteService.get(user.email);
			System.out.println(current.get(Id).service.getName());
			
		}
		System.out.println("Choose service ");
		int id = cin.nextInt();
		System.out.println("1. Accept  or 2. reject ");
		int op = cin.nextInt();
		while(op!=1&&op!=2)
		{
			System.out.println("1. Accept  or 2. reject ");
			op = cin.nextInt();
			
		}
		User user= obj.refundServices.get(id);
		if(op==1) {
			Map<Integer,ServiceStatePair> current=obj.usersCompleteService.get(user.email);
			user.getMyWallet().add(current.get(id).service.cost);
			obj.usersCompleteService.get(user.email).get(id).state=1;
		}else {
			
			obj.usersCompleteService.get(user.email).get(id).state=-1;

		}
		obj.refundServices.remove(id);
	}
	
	public void cashAvaliablity()
	{
		System.out.println("Enter Service Name to set Cash avaliablity: ");
		UI.servicesOptions();
		String serviceName= new Scanner(System.in).next();
		System.out.println("Enter true or false");
		boolean visible= new Scanner(System.in).nextBoolean();
		SavedData.getObj().services.get(serviceName).setCash(visible);
		
	}	
}
