package discount;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import Data.SavedData;
import service.DiscountDecorator;
import service.Service;

public class OverAllDiscount implements Discount {

	@Override
	public void addDiscount() {
		System.out.println("Enter Discount Percentage: ");
		int discount= new Scanner(System.in).nextInt();
		Iterator<Entry<String, Service>> it = SavedData.getObj().services.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String,Service> service = (Map.Entry<String,Service>)it.next();
		
		     Service discountService = new DiscountDecorator(service.getValue());
			 discountService.setDiscount(discount);
		     SavedData.getObj().services.replace(service.getKey(),discountService);     
		}		
	}

}
