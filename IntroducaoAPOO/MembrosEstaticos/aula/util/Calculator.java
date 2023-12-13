package IntroducaoAPOO.MembrosEstaticos.aula.util;

public class Calculator {
	public static final double PI = 3.14159;
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

	public static double circuference(double radius) {
		return 2.0 * PI  * radius;
	}
}
