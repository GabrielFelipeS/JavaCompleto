package ComportamentoMemoriaArray.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);
		System.out.print("Leigth for vect: ");
		int tam = scan.nextInt();
		double[] altura = new double[tam];
		String[] genero = new String[tam];
		double total = 0;
		int qtdMenorIdade = 0;
		
		double contagemDeHomens = 0;
		double somaAlturaMulheres = 0.0;
		
		double menorAltura = Integer.MAX_VALUE;
		double maiorAltura = Integer.MIN_VALUE;
		
		for (int i = 0; i < tam; i++) {
			scan.nextLine();
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = scan.nextDouble();
			
			scan.nextLine();
			
			System.out.printf("Genero da %da pessoa: ", i + 1);
			genero[i] = scan.nextLine();
			
			if(genero[i].equals("M")) {
				contagemDeHomens++;
			} else {
				somaAlturaMulheres +=  altura[i];
			}
			
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}

		}

		System.out.println("Menro altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);
		System.out.printf("Media das alturas das mulhers = %f%n", ((double) total / ((double) tam - contagemDeHomens)));
		System.out.println("Nuemro de homens = " + contagemDeHomens );
		scan.close();

	}
}
