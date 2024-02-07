package ExceptionsERuntimeException.Fixacao.Application;

import java.util.Scanner;

import ExceptionsERuntimeException.Fixacao.Model.Entity.Account;


public class application {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int num = scan.nextInt();

			scan.nextLine();
			System.out.print("Holder: ");
			String holder = scan.nextLine();
			
			System.out.print("Initial balance: ");
			double balance = scan.nextDouble();
			
			System.out.print("Withdraw limit: ");
			double withDrawLimit = scan.nextDouble();
			
			Account account = new Account(num, holder, balance, withDrawLimit);
			
			System.out.print("\nEnter amount for withdraw: ");
			double withDraw = scan.nextDouble();
			account.withDraw(withDraw);
			System.out.println("New Balance: " + account.getBalance());
			
		}  catch (Exception e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		scan.close();
	}
}
