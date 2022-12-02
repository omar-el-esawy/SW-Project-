package provider;

public class LandlineProviderFactory implements ServiceProviderFactory{
	@Override
	public ServiceProvider create(String providerType) {
		
		if(providerType.equals("1"))
			return new MonthlyReceiptLandline();
		else if(providerType.equals("2"))
			return new QuarterReceiptLandline();
		
		return null;
	}
}
