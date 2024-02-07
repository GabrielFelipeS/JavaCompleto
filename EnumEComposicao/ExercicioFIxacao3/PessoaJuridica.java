package EnumEComposicao.ExercicioFIxacao3;

import EnumEComposicao.ExercicioFIxacao3.strategy.PessoaJuridica.ImpostoPessoaJuridicaStrategy;

public class PessoaJuridica extends Pessoa {
	private int quantidateFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, int quantidateFuncionarios) {
		super(nome, rendaAnual);
		this.quantidateFuncionarios = quantidateFuncionarios;
	}

	@Override
	public double calcularImposto() {
		return ImpostoPessoaJuridicaStrategy.getCalculoDeImposto(quantidateFuncionarios <= 10)
				.imposto(getRendaAnual(),0);
	}

}
