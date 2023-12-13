package ComportamentoMemoriaArray.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int tam = scan.nextInt();
		
		int[] A = new int[tam];
		System.out.println("Digite os valores do vetor " + 'A');
		for(int i = 0; i < tam; i++) {
			A[i] = scan.nextInt();	
			scan.nextLine();
		}
		
		int[] B = new int[tam];
		System.out.println("Digite os valores do vetor " + 'B');
		for(int i = 0; i < tam; i++) {
			B[i] = scan.nextInt();	
			scan.nextLine();
		}
	
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0; i < tam; i++) {
			System.out.println(A[i] + B[i]);
		}
		
		scan.close();
	}
}
