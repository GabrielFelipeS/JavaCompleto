package ProgramacaoFuncionalEExpressaoLambda.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import IntroducaoAPOO.Employee;


public class Fixacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter full path file: ");
		String fullPath = scan.nextLine();
		
		System.out.print("Enter salary: ");
		double salaryCompare = scan.nextDouble();
		
		List<Employee> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fullPath))) {
			String line;
			while((line = br.readLine()) != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
			}
	
			System.out.printf("Email of people whose salary is more than: %.2f \n", salaryCompare);
			
			Comparator<Employee> ordernarPorNomeCrescente = (p1,p2) -> p1.getEmail().toLowerCase().compareTo(p2.getEmail().toLowerCase());
			
			list.stream()
				.filter(p -> p.getSalary() > salaryCompare)
				.sorted(ordernarPorNomeCrescente)
				.forEach(p -> System.out.println(p.getEmail()));
			
			Double sum = list.stream()
							.filter(p -> p.getName().startsWith("M"))
							.mapToDouble(p -> p.getSalary())
							.sum();
			
			System.out.printf("Sum salary of people of whose name starts with 'M': %.2f \n", sum);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		scan.close();
	}
}
