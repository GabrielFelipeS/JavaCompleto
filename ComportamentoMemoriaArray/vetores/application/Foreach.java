package ComportamentoMemoriaArray.vetores.application;

public class Foreach {
	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(String nome : vect) {
			System.out.println(nome);
		}
	}
}
