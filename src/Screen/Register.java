package Screen;
import user.*;

public class Register implements Command  {
	Account account;
	public Register(Account account) {
		this.account=account;
	}
	public boolean excute() {
        return (this.account.signUp(account.userName, account.userEmail, account.password));
    }

}
