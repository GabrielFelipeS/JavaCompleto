package IntroducaoAPOO.MembrosEstaticos.aula.application;

import java.util.Locale;
import java.util.Scanner;

import IntroducaoAPOO.MembrosEstaticos.aula.util.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circuference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circuference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", Calculator.PI);
	}


}
