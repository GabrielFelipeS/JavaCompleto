package IntroducaoAPOO.MembrosEstaticos.Exercicio.application;

import java.util.Locale;
import java.util.Scanner;

import IntroducaoAPOO.MembrosEstaticos.Exercicio.CurrencyConverter.CurrencyConverter;

public class Application {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = scan.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double bought = scan.nextDouble();
		
		double reais = CurrencyConverter.convert(dollar, bought);
		System.out.printf("Amount to be pait in reais = %.2f%n", reais);
	}
}
