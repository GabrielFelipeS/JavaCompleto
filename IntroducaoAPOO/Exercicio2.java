package IntroducaoAPOO;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Employee employee = new Employee();
		Scanner scan = new Scanner(System.in);
		System.out.print("Name: ");
		employee.name = scan.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = scan.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = scan.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = scan.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Update data: " + employee);
	}
}
