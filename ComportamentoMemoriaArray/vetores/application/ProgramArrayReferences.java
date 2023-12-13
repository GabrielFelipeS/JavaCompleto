package ComportamentoMemoriaArray.vetores.application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class ProgramArrayReferences {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Leigth for vect: ");
		int tam = scan.nextInt();
		Product[] vect = new Product[tam];
		
		for(int i = 0; i < tam; i++) {
			scan.nextLine();
			System.out.printf("Product name in index %d: ", i);
			String name = scan.nextLine();
			System.out.printf("Product price in index %d: ", i);
			double price = scan.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double total = 0;
		for(int i = 0; i < vect.length; i++) {
			total += vect[i].getPrice();
		}
		
		System.out.println("Average is vect = " + (total/vect.length));
		System.out.println(Arrays.toString(vect));
		scan.close();
	}
}
