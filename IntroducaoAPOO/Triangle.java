package IntroducaoAPOO;

public class Triangle {
	double A;
	double B;
	double C;
	
	public Triangle() {}
	
	public Triangle(int A, int B, int C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	double area() {
		double p = perimetro();
		return Math.sqrt(p * (p - A) * (p - B) * (p - C));
	}
	
	double perimetro() {
		return (A + B + C) / 2.0;
	}
	
}
