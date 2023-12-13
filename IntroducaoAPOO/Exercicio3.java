package IntroducaoAPOO;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Student aluno = new Student();
		aluno.nome = scan.nextLine();
		aluno.nota1 = scan.nextDouble();
		aluno.nota2 = scan.nextDouble();
		aluno.nota3 = scan.nextDouble();
		System.out.println("FINAL GRADE = " + aluno.sum());
		System.out.println(aluno.status());
		aluno.missingPoints();
	}
}
