package discount;

import java.util.Scanner;

import Data.SavedData;
import Screen.UI;
import service.DiscountDecorator;
import service.Service;

public class SpecificDiscount implements Discount{

	@Override
	public void addDiscount() {
		
		UI.servicesOptions();
		System.out.println("Enter Service Name to Add Discount to it: ");
		String serviceName= new Scanner(System.in).next();
		
		System.out.println("Enter Discount Percentage: ");
		int discount= new Scanner(System.in).nextInt();
		
		Service discountService = new DiscountDecorator(SavedData.getObj().services.get(serviceName));
	    discountService.setDiscount(discount);
	    SavedData.getObj().services.put(serviceName,discountService);
				
	}

}
