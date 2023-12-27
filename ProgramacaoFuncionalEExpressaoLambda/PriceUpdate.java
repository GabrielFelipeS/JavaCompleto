package ProgramacaoFuncionalEExpressaoLambda;

import java.util.function.Consumer;

import ComportamentoMemoriaArray.vetores.application.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
