package ExercicioDeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeFixacaoContrutores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the account number: ");
		int accountNumber = scan.nextInt();
		
		scan.nextLine();
		System.out.print("Enter the account holder: ");
		String holder = scan.nextLine();
		
		System.out.print("Is there na initial deposit (y/n): ");
		String initialDeposit = scan.next();
		
		double value = 0;
		
		Account account = new Account(accountNumber, holder);
		
		if(initialDeposit.toLowerCase().charAt(0) == 'y') {
			System.out.print("Enter initial deposit value: ");
			value = scan.nextDouble();
			account.deposit(value);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a deposit value: ");
		value = scan.nextDouble();
		account.deposit(value);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		System.out.print("\nEnter a withdraw value: ");
		value = scan.nextDouble();
		account.withdraw(value);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
	}
}
