import java.util.*;
public class ATMTester {
	public static void main (String [] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		ATM banknoises = new ATM();
		System.out.print ("Deposit something. Anything. Please.");
		float deposit = keyboard.nextFloat();
		banknoises.deposit("0", deposit);
		System.out.println (banknoises.getAccounts());
	}
}
