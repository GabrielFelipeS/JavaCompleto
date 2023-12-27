package Interfaces.ExerFixacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Interfaces.ExerFixacao.models.Contract;
import Interfaces.ExerFixacao.models.PaypalService;

public class Application {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		
		System.out.println("Enter the contract details");
		System.out.print("Number: ");
		int number = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate ld = LocalDate.parse(scan.nextLine(), dtf);
		
		System.out.print("Contract value: ");
		
		double value = scan.nextDouble();
		
		Contract contract = new Contract(number, ld, value);
		
		System.out.print("Enter the number of installments: ");
		int parcels = scan.nextInt();
		
		ConstractService service = new ConstractService(new PaypalService());
		service.processContract(contract, parcels);
		
		System.out.println("Installments: ");
		contract.printInstallments();
	}
}
