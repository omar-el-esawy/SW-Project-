package provider;

public class DonationProviderFactory implements ServiceProviderFactory{
	@Override
	public ServiceProvider create(String providerType) {
		
		if (providerType.equals("1")) {
			return new CancerHospital();
		}else if (providerType.equals("2")) {
			return new Schools();
		}else if (providerType.equals("3")) {
			return new NGOs();
		}
		return null;
	}
}
