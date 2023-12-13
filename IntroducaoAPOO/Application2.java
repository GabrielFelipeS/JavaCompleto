package IntroducaoAPOO;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		Triangle triangulo1 = new Triangle();
		Triangle triangulo2 = new Triangle();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Enter the measures of triangle X: ");
		
		triangulo1.A = entrada.nextDouble();
		triangulo1.B = entrada.nextDouble();
		triangulo1.C = entrada.nextDouble();
		
		System.out.println("Enter the measures of triangle y: ");
		triangulo2.A = entrada.nextDouble();
		triangulo2.B = entrada.nextDouble();
		triangulo2.C = entrada.nextDouble();
		entrada.close();

		double areaX = triangulo1.area();
		double areaY = triangulo2.area();
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		} else if(areaX < areaY) {
			System.out.println("Larger area: Y");
		} else {
			System.out.println("Not have larger area, area is equals");
		}
	}

}
