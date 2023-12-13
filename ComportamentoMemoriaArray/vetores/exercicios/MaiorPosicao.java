package ComportamentoMemoriaArray.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int tam = scan.nextInt();
		double[] numeros = new double[tam];
		
		double maior = Integer.MIN_VALUE;
		for(int i = 0; i < tam; i++) {
			scan.nextLine();
			System.out.print("Digite um numero: ");
			numeros[i] = scan.nextDouble();
			
			if(maior < numeros[i]) {
				maior = numeros[i];
			}
			
		}
		
		
		System.out.println("Maior numero = " + maior);
		int i = 0;
		for(double numero : numeros) {
			if(numero == maior) {
				System.out.println("POSICAO DO MAIOR VALOR = " + i);
				break;
			}
			i++;
		}
		
		scan.close();
	}
}
