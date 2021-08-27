
public class ATM {
	private String accountID;
	private float balance;
	

	public ATM(String accountID, float balance) {
		super();
		this.accountID = accountID;
		this.balance = balance;
	}
	
	public void deposit (int deposit) {
		balance += deposit;
	}
}
