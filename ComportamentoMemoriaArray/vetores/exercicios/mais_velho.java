package ComportamentoMemoriaArray.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Leigth for vect: ");
		int tam = scan.nextInt();
		String[] nomes = new String[tam];
		double[] notas1 = new double[tam];
		double[] notas2 = new double[tam];
		
		
		for(int i = 0; i < tam; i++) {
			scan.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %doaluno: %n", i + 1);
			nomes[i] = scan.nextLine();
			notas1[i] = scan.nextDouble();
			notas2[i] = scan.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0;i < tam; i++) {
			if((notas1[i] + notas2[i])/2.0 >= 6.0) {
				System.out.println(nomes[i]);
			}
		}

		scan.close();
	}
}
