package ComportamentoMemoriaArray.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int tam = scan.nextInt();
		int[] numeros = new int[tam];
		
		for(int i = 0; i < tam; i++) {
			scan.nextLine();
			System.out.print("Digite um numero: ");
			numeros[i] = scan.nextInt();
			
		}
		
		
		System.out.println("NUMEROS NEGATIVOS");
		for(int numero : numeros) {
			if(numero < 0) {
				System.out.println(numero);
			}
		}
		
	
		scan.close();
	}
}
