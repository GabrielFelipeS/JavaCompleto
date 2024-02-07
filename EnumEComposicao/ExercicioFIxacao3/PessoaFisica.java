package EnumEComposicao.ExercicioFIxacao3;

import EnumEComposicao.ExercicioFIxacao3.strategy.PessoaFIsica.ImpostoPessoaFisicaStrategy;

public class PessoaFisica extends Pessoa {
	private Double gastoComSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	@Override
	public double calcularImposto() {
		return ImpostoPessoaFisicaStrategy.getCalculoDeImposto(getRendaAnual() >= 2000, gastoComSaude != 0)
				.imposto(getRendaAnual(), gastoComSaude);
	}

}
