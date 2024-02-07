package EnumEComposicao.ExercicioFIxacao3.strategy.PessoaFIsica;

import EnumEComposicao.ExercicioFIxacao3.strategy.ImpostoStrategy;

public class RendaAnualAltaFalse_GastosMedicosFalse implements ImpostoStrategy {

	@Override
	public double imposto(double renda, double gastoMedico) {
		return renda * 0.25;
	}

}
