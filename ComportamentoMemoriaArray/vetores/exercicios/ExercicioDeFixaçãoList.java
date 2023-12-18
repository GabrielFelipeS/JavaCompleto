package ComportamentoMemoriaArray.vetores.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import IntroducaoAPOO.Employee;

public class ExercicioDeFixaçãoList {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("How many employees will be registred? ");
		int manyEmployees = scan.nextInt();
		scan.nextLine();
		
		List<Employee> employees = new ArrayList<>();
		for(int i = 0;i < manyEmployees; i++) {
			System.out.printf("\nEmployee #%d\n", i + 1);
			
			System.out.print("Id: ");
			int id = scan.nextInt(); 
			
			while (hasId(employees, id)) {
				System.out.print("Id already taken. Try again: ");
				id = scan.nextInt();
			}
			
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine();
			
			System.out.print("Salary: ");
			double salary = scan.nextDouble(); scan.nextLine();
			
			employees.add(new Employee(id, name, salary));
			
		}
		
		System.out.print("Enter the employee id that will have salary increscent: ");
		int id = scan.nextInt(); scan.nextLine();
		int index = Employee.indexOfIDInList(id, employees);
		
		if(index != -1) {
			Employee employee = employees.get(index);
			
			System.out.print("Enter the percentage: ");
			double percentage = scan.nextDouble(); scan.nextLine();
			employee.increaseSalary(percentage);
			
			
		} else {
			System.out.println("This id does not exist!");
		}
		
		Collections.sort(employees);
		
		System.out.println("List of employees: ");
		for(Employee employee: employees) {
			System.out.println(employee.apresentar());
		}
		
		scan.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
