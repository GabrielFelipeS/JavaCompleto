package EnumEComposicao.ExercicioFIxacao3;

public abstract class Pessoa {
	private String nome;
	private Double rendaAnual;

	
	
	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public abstract double calcularImposto();
	
	@Override
	public String toString() {
		return String.format("%s: $ %.2f", nome, calcularImposto());
	}
}
