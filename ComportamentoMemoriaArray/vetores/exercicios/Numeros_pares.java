package ComportamentoMemoriaArray.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_pares {
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
			
			
			System.out.println("NUMEROS PARES");
			for(int numero : numeros) {
				if(numero % 2 == 0) {
					System.out.print(numero + " ");
				}
			}
			
		
			scan.close();
		}
	}

