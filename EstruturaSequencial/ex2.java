package EstruturaSequencial;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		double a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		System.out.printf("A = %.4f%n", (Math.pow(a, 2) * Math.PI));
	}
}
