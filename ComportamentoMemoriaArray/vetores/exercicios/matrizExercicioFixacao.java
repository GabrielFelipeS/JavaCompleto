package ComportamentoMemoriaArray.vetores.exercicios;

import java.util.Scanner;

public class matrizExercicioFixacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numLine = scan.nextInt();
		int numColumn = scan.nextInt();
		
		int[][] matriz = new int[numLine][numColumn];
		
		for(int i = 0;i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = scan.nextInt();
			}
		}
		
		int num = scan.nextInt();
		for(int i = 0;i < matriz.length; i++) {	
			for(int j = 0; j < matriz[i].length; j++) {
				if(num == matriz[i][j]) {
					printPosition(i, j,  matriz);
				}
			}
		}
		scan.close();
		
	}

	private static void printPosition(int linha, int coluna, int[][] matriz) {
		int tamLinha = matriz.length - 1;
		int tamColuna = matriz[linha].length - 1;
		
		System.out.println(String.format("Position %d,%d: ", linha, coluna));
		if(coluna - 1 >= 0) {
			System.out.println("Left: " +  matriz[linha][coluna - 1]);
		}
		
		if(linha - 1 >= 0) {
			System.out.println("Up: " +  matriz[linha - 1][coluna]);
		}
		
		if(coluna + 1 <= tamColuna) {
			System.out.println("Right: " +  matriz[linha][coluna + 1]);
		}
	
		if(linha + 1 <= tamLinha) {
			System.out.println("Down: " +  matriz[linha + 1][coluna]);
		}
	}

}
