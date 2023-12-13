package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		int cod, numero, cod2, numero2;
		double preco, preco2;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		cod = sc.nextInt();
		numero = sc.nextInt();
		preco = sc.nextDouble();
		cod2 = sc.nextInt();
		numero2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		System.out.printf("Valor a pagar: R$ %.2f%n", (numero * preco + numero2 * preco2));
	}
}
