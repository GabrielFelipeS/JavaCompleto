package IntroducaoAPOO;

public class Retangle {
	double width;
	double height;
	
	double area() {
		return width * height;
	}
	
	double perimeter() {
		return width * 2 + height * 2;
	}
	
	double diagonal() {
		return Math.sqrt( Math.pow(width, 2) + Math.pow(height, 2) );
	}
}
