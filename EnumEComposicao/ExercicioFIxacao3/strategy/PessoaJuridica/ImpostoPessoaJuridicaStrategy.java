package EnumEComposicao.ExercicioFIxacao3.strategy.PessoaJuridica;

import java.util.Map;

import EnumEComposicao.ExercicioFIxacao3.strategy.ImpostoStrategy;
import EnumEComposicao.ExercicioFIxacao3.strategy.PessoaFIsica.RendaAnualAltaFalse_GastosMedicosFalse;
import EnumEComposicao.ExercicioFIxacao3.strategy.PessoaFIsica.RendaAnualAltaFalse_GastosMedicosTrue;
import EnumEComposicao.ExercicioFIxacao3.strategy.PessoaFIsica.RendaAnualAltaTrue_GastosMedicosFalse;
import EnumEComposicao.ExercicioFIxacao3.strategy.PessoaFIsica.RendaAnualAltaTrue_GastosMedicosTrue;

public class ImpostoPessoaJuridicaStrategy {
	private static final Map<Boolean, ImpostoStrategy> map = Map.of(
			true, new MicroEmpresaImposto(),
			false, new EmpresaImposto()
			);
			
	public static ImpostoStrategy getCalculoDeImposto(boolean MicroEmpresa) {
		return map.get(MicroEmpresa);
	}

}
