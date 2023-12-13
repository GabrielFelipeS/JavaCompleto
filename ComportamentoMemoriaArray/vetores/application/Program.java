package ComportamentoMemoriaArray.vetores.application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Leigth for vect: ");
		int tam = scan.nextInt();
		double[] vect = new double[tam];
		
		for(int i = 0; i < tam; i++) {
			System.out.printf("Vect in index %d: ", i);
			vect[i] = scan.nextDouble();
		}
		
		double total = 0;
		for(int i = 0; i < vect.length; i++) {
			total += vect[i];
		}
		
		System.out.println("Average is vect = " + (total/vect.length));
		System.out.println(Arrays.toString(vect));
		scan.close();
	}
	
	
}
