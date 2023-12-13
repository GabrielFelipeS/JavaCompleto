package EstruturaSequencial;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		int a, b, c, d;
		a = scan();
		b = scan();
		c = scan();
		d = scan();
		System.out.println("Diferença = " + (a * b - c * d));
	}
	
	private static int scan() {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		sc.nextLine();
		return x;
	}
	
}
