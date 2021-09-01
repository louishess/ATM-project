import java.util.HashMap;

public class ATM {
	private HashMap<String, Double> accounts;

	public ATM() {
		super();
		accounts = new HashMap<String, Double>();
	}

	public void deposit(String accountID, double deposit) throws Exception {
		if (deposit < 0) {
			throw new IllegalArgumentException(
					"oh. bet you think you're real clever, don't you. 'oh, it doesn't have a withdraw function, ill just deposit a negative number and it'll spit money to me. heheheeheheh!' cute. really. cute. not today buddy. you're allowed to give me money. get outta here with these negative numbers.");
		}
		if (accounts.containsKey(accountID)) {
			accounts.replace(accountID, accounts.get(accountID) + deposit);
		} else {
			accounts.put(accountID, deposit);
		}
	}

	public HashMap<String, Double> getAccounts() {
		return accounts;
	}

	public void setAccounts(HashMap<String, Double> accounts) {
		this.accounts = accounts;
	}

	public void withdraw(String accountID, double withdraw) {
		if (withdraw > accounts.get(accountID)) {
			throw new IllegalArgumentException("You do not have sufficient funds to make this withdrawal");
		}
		accounts.replace(accountID, accounts.get(accountID), accounts.get(accountID) - withdraw);
	}

	public Double checkBalance(String accountID) {
		if (accounts.containsKey(accountID) == false) {
			throw new IllegalArgumentException("Account does not exist");
		}
		return accounts.get(accountID);
	}
}
