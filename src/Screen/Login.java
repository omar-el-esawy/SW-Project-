package Screen;
import user.Account;

public class Login implements Command  {
	Account account;
	public Login(Account account) {
		this.account=account;
	}
	public boolean excute() {
        return (account.login(account.userName,account.password));
    }

}
