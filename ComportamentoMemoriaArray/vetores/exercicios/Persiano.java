package ComportamentoMemoriaArray.vetores.exercicios;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Persiano {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Leigth for vect: ");
		int tam = scan.nextInt();
		
		boolean isBusyRoom[] = new boolean[9];
		Person[] vect = new Person[tam];
		
		int[] array = new int[4];
		array[0] = 1;
		Integer x = 1; 
		boolean bol = Arrays.stream(array).anyMatch(x::equals);
		
		
		System.out.println(bol);
		double total = 0;
		int qtdMenorIdade = 0;
		for(int i = 0; i < tam; i++) {
			scan.nextLine();
			System.out.printf("Rent: #%d %n", i + 1);
			System.out.print("Nome: ");
			String name = scan.nextLine();
			
			System.out.print("Email: ");
			String email= scan.nextLine();
			
			while(true) {
				System.out.print("Room: ");
				 int quarto = scan.nextInt();
				
				
				if(isBusyRoom[quarto] == true) {
					System.out.println("Room is busy");
				} else {
					vect[i] = new Person(name, email, quarto);
					isBusyRoom[quarto] = true;
					break;
				}
				
			} 
			
		}
		
		Arrays.sort(vect);
		System.out.println("Busy rooms:");
		for(Person pessoa : vect) {
			System.out.println(pessoa);
		}

		scan.close();
	}
}
