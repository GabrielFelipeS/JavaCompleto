package IntroducaoAPOO;

public class Student {
	String nome;
	double nota1;
	double nota2;
	double nota3;
	
	double sum() {
		return nota1 + nota2 + nota3;
	}
	
	String status() {
		String status;
		if(sum() >= 60.0) {
			status = "PASS";
		} else {
			status = "FAILED";
		}
		return status;
	}
	
	void missingPoints() {
		String status = status();
		
		if(status.equals("FAILED")) {
			System.out.printf("MISSING %.2f POINTS", 60 - sum() );
		}
	}
}
