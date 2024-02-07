package EnumEComposicao.ExercicioFIxacao3.strategy.PessoaFIsica;

import java.util.Map;

import EnumEComposicao.ExercicioFIxacao3.strategy.ImpostoStrategy;

public class ImpostoPessoaFisicaStrategy {
	private static final  Map<Boolean, ImpostoStrategy> MapSeRendaAnualAlta = 
			Map.of(true, new RendaAnualAltaTrue_GastosMedicosTrue(),
			false, new RendaAnualAltaTrue_GastosMedicosFalse());
	
	private static final  Map<Boolean, ImpostoStrategy> MapSeRendaAnualBaixa =
			Map.of(true, new RendaAnualAltaFalse_GastosMedicosTrue(),
			false, new RendaAnualAltaFalse_GastosMedicosFalse());
	
	private static final Map<Boolean, Map<Boolean, ImpostoStrategy>> map = Map.of(
			true, MapSeRendaAnualAlta,
			false,MapSeRendaAnualBaixa
			);
			
	public static ImpostoStrategy getCalculoDeImposto(boolean rendaMaiorIgualQue20k, boolean gastoComSaude) {
		return map.get(rendaMaiorIgualQue20k).get(gastoComSaude);
	}

}
