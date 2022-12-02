package provider;

import java.util.Scanner;

public class InternetProviderFactory implements ServiceProviderFactory{

	@Override
	public ServiceProvider create() {

		System.out.println("Choose Your Service Provider:");
		System.out.println("Press 1. Etisalat");
		System.out.println("Press 2. Vodafone");
		System.out.println("Press 3. WE");
		System.out.println("Press 4. Orange");
		String  providerType = new Scanner(System.in).next();
		
		if (providerType.equals("1")) {
			return new Etisalat();
		}else if (providerType.equals("2")) {
			return new Vodafone();
		}else if (providerType.equals("3")) {
			return new Orange();
		}else if (providerType.equals("4")) {
			return new WE();
		}
		return null;
	}

}
