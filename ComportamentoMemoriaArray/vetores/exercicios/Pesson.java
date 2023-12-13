package ComportamentoMemoriaArray.vetores.exercicios;

public class Pesson {
	private String nome;
	private int idade;
	private double altura;

	public Pesson(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public Pesson(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	
	
}
