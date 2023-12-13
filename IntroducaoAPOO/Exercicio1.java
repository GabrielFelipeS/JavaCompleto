package IntroducaoAPOO;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rectangle width and height: ");
		Retangle retangle = new Retangle();
		retangle.width = scan.nextDouble();
		retangle.height = scan.nextDouble();
		System.out.printf("AREA = %.2f\n", retangle.area());
		System.out.printf("PERIMETER = %.2f\n", retangle.perimeter());
		System.out.printf("DIAGONAL = %.2f\n", retangle.diagonal());
	}
}
