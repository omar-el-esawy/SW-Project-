package provider;

import java.security.Provider;

public interface ServiceProviderFactory {
	public ServiceProvider create(String providerType);
	
}
