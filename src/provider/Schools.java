package provider;

public class Schools extends ServiceProvider{
	@Override
	public String getName() {
		return "Schools";
	}


	@Override
	public void setInfo(double amount) {
		money+=amount;		
	}
}
