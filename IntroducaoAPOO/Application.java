package IntroducaoAPOO;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		double xA, xB,xC, yA, yB, yC;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Enter the measures of triangle X: ");
		xA = entrada.nextDouble();
		xB = entrada.nextDouble();
		xC = entrada.nextDouble();
		
		System.out.println("Enter the measures of triangle y: ");
		yA = entrada.nextDouble();
		yB = entrada.nextDouble();
		yC = entrada.nextDouble();
		entrada.close();
		
		double p = (xA + xB + xC) /2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC)/2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Tirangle X area: %.4f\n", areaX);
		System.out.printf("Tirangle Y area: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		} else if(areaX < areaY) {
			System.out.println("Larger area: Y");
		} else {
			System.out.println("Not have larger area, area is equals");
		}

	}
}
