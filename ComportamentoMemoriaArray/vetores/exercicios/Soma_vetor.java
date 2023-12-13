package ComportamentoMemoriaArray.vetores.exercicios;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import ComportamentoMemoriaArray.vetores.application.Product;

public class Soma_vetor {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Leigth for vect: ");
		int tam = scan.nextInt();
		double[] vect = new double[tam];
		
		for(int i = 0; i < tam; i++) {
			scan.nextLine();

			System.out.print("Digite um numero: ");
			vect[i] = scan.nextDouble();
		}
		
		double soma = 0;
		System.out.println("VALORES = ");
		for(int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
			soma += vect[i];
		}
		System.out.println("\nSOMA = " + soma);
		System.out.println("MEDIA = " + (soma/vect.length));
		scan.close();
	}
}
