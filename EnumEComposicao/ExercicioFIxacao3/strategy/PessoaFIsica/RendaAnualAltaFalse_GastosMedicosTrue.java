package EnumEComposicao.ExercicioFIxacao3.strategy.PessoaFIsica;

import EnumEComposicao.ExercicioFIxacao3.strategy.ImpostoStrategy;

public class RendaAnualAltaFalse_GastosMedicosTrue implements ImpostoStrategy{

	@Override
	public double imposto(double renda, double gastoMedico) {
		return (renda * 0.15) - (gastoMedico * 0.5);
	}

}
