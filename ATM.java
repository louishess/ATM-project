import java.util.HashMap;

public class ATM {
	private HashMap<String, Float> accounts;
	
	public ATM() {
		super();
		accounts = new HashMap<String, Float>();
	}
	
	public void deposit (String accountID, float deposit) {
		if (accounts.containsKey(accountID)) {
			accounts.replace(accountID, accounts.get(accountID) + deposit);
		}
		else {
			accounts.put(accountID, deposit);
		}
	}

	public HashMap<String, Float> getAccounts() {
		return accounts;
	}

	public void setAccounts(HashMap<String, Float> accounts) {
		this.accounts = accounts;
	}
}
