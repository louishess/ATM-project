import java.util.HashMap;

public class ATM {
	private HashMap<String, Float> accounts;
	

	public ATM(HashMap<String, Float> accounts) {
		super();
		this.accounts = accounts;
	}
	
	public void deposit (String accountID, float deposit) {
		balance += deposit;
	}
}
