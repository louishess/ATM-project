import java.util.Scanner;

public class ATMTester2 {
	public static void main (String [] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		ATM bank = new ATM();
		
		bank.deposit("Winfrey", 25159684372.43);
		bank.deposit("Bezos", 193495330293.43);
		bank.deposit("Bezos", 20394353.35);
		bank.withdraw("Bezos", 3593293.66);
		bank.deposit("MrTheiss",64033.55);
		bank.withdraw("MrTheiss", 443964.46);
		System.out.println(bank.checkBalance("Bezos"));
		System.out.println(bank.checkBalance("Winfrey"));
		System.out.println(bank.checkBalance("YoMama"));
		System.out.println(bank.checkBalance("MrTheiss"));
	}
}
