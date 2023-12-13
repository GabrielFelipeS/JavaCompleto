package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		int number, horas;
		double salarioHora;
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		number = sc.nextInt();
		sc.nextLine();
		
		horas = sc.nextInt();
		sc.nextLine();
		
		salarioHora = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", (salarioHora * horas));
	}
}
