package ComportamentoMemoriaArray.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Leigth for vect: ");
		int tam = scan.nextInt();
		Pesson[] vect = new Pesson[tam];
		
		double total = 0;
		int qtdMenorIdade = 0;
		for(int i = 0; i < tam; i++) {
			scan.nextLine();
			System.out.printf("Dados da %da pessoa: %n", i + 1);
			System.out.print("Nome: ");
			String name = scan.nextLine();
			
			System.out.print("Idade: ");
			int idade = scan.nextInt();
			
			System.out.print("Altura: ");
			double altura = scan.nextDouble();
			vect[i] = new Pesson(name, idade, altura);
			
			total += altura;
			
			if(idade < 16) {
				qtdMenorIdade++;
			}
		}
		
		System.out.printf("Altura média: %f%n", (total/vect.length));
		System.out.println("Pessoas com menos de 16 anos: " + ((double) qtdMenorIdade / vect.length) * 100.0 + "%");
		
		for(Pesson pessoa : vect) {
			if(pessoa.getIdade() < 16) {
				System.out.println(pessoa.getNome());
			}
		}

		scan.close();
	}
}
