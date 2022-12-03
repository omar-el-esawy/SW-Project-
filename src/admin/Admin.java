package admin;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Data.SavedData;
import Screen.UI;
import service.*;
import user.User;
public class Admin {
	
	public void addDiscount()
	{
		System.out.println("Enter Service Name to Add Discount to it: ");
		UI.servicesOptions();
		String serviceName= new Scanner(System.in).next();
		System.out.println("Enter Discount Percentage");
		int discount= new Scanner(System.in).nextInt();
		System.out.println(serviceName);
		if(serviceName=="All") {
			
			for(Map.Entry<String,Service> service :SavedData.getObj().services.entrySet()) {
				 Service discountService = new DiscountDecorator(SavedData.getObj().services.get(service.getKey()));
			     discountService.setDiscount(discount);
			     System.out.println(discountService.getDiscounts()+"kkkkkkkkk");
			     SavedData.getObj().services.put(service.getKey(),discountService);
			     System.out.println(SavedData.getObj().services.get(service.getKey()).getDiscounts()+"kkkkkkkkk");

			}
			
		}else {
			//Service oldService =  SavedData.getObj().services.get(serviceName);
//			 System.out.println(SavedData.getObj().services.get(serviceName).name);
//			 Service discountService = new DiscountDecorator(SavedData.getObj().services.get(serviceName));
			
			 System.out.println(Search.search(serviceName).get(0).service.name);
//			 System.out.println(discountService.name);
//			 discountService.setDiscount(discount);
//		     System.out.println(discountService.getDiscounts()+"kkkkkkkkk");
//		     SavedData.getObj().services.put(serviceName,discountService);
//		     System.out.println( SavedData.getObj().services.get(serviceName).getDiscounts()+"kkkkkkkkk");

		}
			
       
	
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
	
	
	
	 public void avaliablityCash()
	{
		System.out.println("Enter Service Name to set Cash avaliablity: ");
		UI.servicesOptions();
		String serviceName= new Scanner(System.in).next();
		System.out.println("Enter true or false");
		boolean visible= new Scanner(System.in).nextBoolean();
		if(serviceName=="All") {
			
			for(Map.Entry<String,Service> service :SavedData.getObj().services.entrySet()) {
				
				 service.getValue().setCash(visible);
			}
			
		}else {
			SavedData.getObj().services.get(serviceName).setCash(visible);
		}
	}
		

}
