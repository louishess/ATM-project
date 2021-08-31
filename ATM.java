import java.util.HashMap;
public class ATM {
	private HashMap<String, Float> accounts;
	
	public ATM() {
		super();
		accounts = new HashMap<String, Float>();
	}
	
	public void deposit (String accountID, float deposit) throws Exception {
		if (deposit < 0) {
			throw new IllegalArgumentException("oh. bet you think you're real clever, don't you. 'oh, it doesn't have a withdraw function, ill just deposit a negative number and it'll spit money to me. heheheeheheh!' cute. really. cute. not today buddy. you're allowed to give me money. get outta here with these negative numbers.");
		}
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
	public void withdraw (String accountID, float withdraw) {
		if (withdraw > accounts.get(accountID)) {
			System.out.println ("You do not have sufficient funds to make this withdrawal");
		}
		else {
			accounts.replace(accountID, accounts.get(accountID), accounts.get(accountID) - withdraw);
		}
	}
}
