package ProgramacaoFuncionalEExpressaoLambda.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ComportamentoMemoriaArray.vetores.application.Product;

public class Resolvido {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter full path file: ");
		String fullPath = scan.nextLine();
		
		List<Product> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fullPath))) {
			String line;
			while((line = br.readLine()) != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
			}
			
			Double avg = list.stream()
							.mapToDouble(p -> p.getPrice())
							.average().getAsDouble();
			
			System.out.printf("Average price: %.2f\n", avg);
			
			
			Comparator<Product> ordernarPorNomeDecrescente = (p1,p2) -> p2.getName().toLowerCase().compareTo(p1.getName().toLowerCase());
			list.stream()
				.filter(p -> p.getPrice() < avg)
				.sorted(ordernarPorNomeDecrescente)
				.forEach(p -> System.out.println(p.getName()));
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		scan.close();
	}
}
