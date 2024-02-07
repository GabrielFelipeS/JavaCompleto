package EnumEComposicao.ExercicioFIxacao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of tax payers: ");
		int numberTaxPayers = scan.nextInt();
		
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		for(int i = 0; i < numberTaxPayers; i++) {
			scan.nextLine();
			System.out.print("Individual or company (i/c)? ");
			char individualOrCompany = scan.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = scan.nextLine();
			
			System.out.print("Anual income: ");
			double anualIncome = scan.nextDouble();
			
			Pessoa pessoa;
			if(individualOrCompany == 'i') {
				System.out.print("Health Experditures: ");
				double healthExperditures = scan.nextDouble();
				pessoa = new PessoaFisica(name, anualIncome, healthExperditures);
			} else {
				System.out.print("Number of employees: ");
				int NumberOfEmployees = scan.nextInt();
				pessoa = new PessoaJuridica(name, anualIncome, NumberOfEmployees);
			}
			
			pessoas.add(pessoa);
		}
		
		System.out.println("TAXES PAID");
		pessoas.stream().forEach(System.out::println);
		
		
		System.out.println();
		System.out.println("Total taxes: $" + pessoas.stream().mapToDouble(Pessoa::calcularImposto).sum());
		
	}
}
