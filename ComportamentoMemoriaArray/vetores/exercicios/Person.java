package ComportamentoMemoriaArray.vetores.exercicios;

public class Person implements Comparable<Person>{
	private String nome;
	private String email;
	private int quarto;
	private int idade;
	private double altura;

	public Person(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public Person(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}
	
	public Person(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public int getQuarto() {
		return quarto;
	}
	
	
	@Override
	public String toString() {
		return String.format("%d: %s, %s", quarto, nome, email);
	}

	public int compareTo(Person person) {
		return quarto - person.quarto;
	}

	

}
