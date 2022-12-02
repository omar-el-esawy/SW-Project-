package provider;

public class MobileProviderFactory implements ServiceProviderFactory {
	@Override
	public ServiceProvider create(String providerType) {
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
