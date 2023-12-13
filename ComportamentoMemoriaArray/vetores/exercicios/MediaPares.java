package ComportamentoMemoriaArray.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int tam = scan.nextInt();
		int[] numeros = new int[tam];
		
		double somaPares = 0;
		double qtdPares = 0;
		
		for(int i = 0; i < tam; i++) {
			scan.nextLine();
			System.out.print("Digite um numero: ");
			numeros[i] = scan.nextInt();
			if(numeros[i] % 2 == 0) {
				somaPares += numeros[i];
				qtdPares++;
			}
		}
		
		
		System.out.println("MEDIA DOS PARES = " + (somaPares/qtdPares));
		
	
		scan.close();
	}
}
