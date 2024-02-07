package EnumEComposicao.ExercicioFIxacao3.strategy.PessoaJuridica;

import EnumEComposicao.ExercicioFIxacao3.strategy.ImpostoStrategy;

public class MicroEmpresaImposto implements ImpostoStrategy {

	@Override
	public double imposto(double renda, double gastoMedico) {
		return renda * 0.16;
	}

}
