package EnumEComposicao.ExercicioResolvido1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter department´s name: ");
		String departament = scan.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = scan.nextLine();
		System.out.print("Level: ");
		String workLevel = scan.nextLine();
		System.out.print("Name: ");
		double baseSalary = scan.nextDouble();
		Worker worker = new Worker(workerName, WorkedLevel.valueOf(workLevel), baseSalary, new Department(departament));
		
		System.out.print("How many contracts to this worker? ");
		int n = scan.nextInt();
		
		for(int i = 1;i <= n; i++) {
			System.out.printf("Enter contract #%d data: \n", i);
			System.out.println("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(scan.next());
			System.out.print("Valur per hour: ");
			double valuePerHour = scan.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = scan.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = scan.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartamentName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		scan.close();
	}
}
