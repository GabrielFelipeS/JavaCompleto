package ProgramacaoFuncionalEExpressaoLambda;

import java.util.function.Function;

import ComportamentoMemoriaArray.vetores.application.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
