package EstruturaSequencial;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		double A, B, C;
		Scanner sc = new Scanner(System.in);
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		

		System.out.printf("TRIANGULO: %.3f%n", (A * C)/2);
		System.out.printf("CIRCULO: %.3f%n", (Math.PI * Math.pow(C, 2)));
		System.out.printf("TRAPEZIO: %.3f%n", (A + B) * 1/2 * C );
		System.out.printf("QUADRADO: %.3%n", Math.pow(A, 2));
		System.out.printf("RETANGULO: %.3f%n", (A * B));
	}

}
