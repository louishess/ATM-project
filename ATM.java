import java.util.HashMap;

public class ATM {
	private HashMap<String, Float> accounts;
	
	//TODO compatibility w/ newID creation?
	public ATM(HashMap<String, Float> accounts) {
		super();
		this.accounts = accounts;
	}
	
	public void deposit (String accountID, float deposit) {
		if (accounts.containsKey(accountID)) {
			accounts.replace(accountID, accounts.get(accountID) + deposit);
		}
		else {
			//might break with the constructor but honestly this method makes too much sense to not use
			String newID = "" + accounts.size();
			accounts.put(newID, deposit);
		}
	}
}
