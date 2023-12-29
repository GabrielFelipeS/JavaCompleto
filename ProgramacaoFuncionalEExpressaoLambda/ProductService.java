package ProgramacaoFuncionalEExpressaoLambda;

import java.util.List;
import java.util.function.Predicate;

import ComportamentoMemoriaArray.vetores.application.Product;

public class ProductService {
	public double filteredSum(List<Product> list, Predicate<Product> c) {
		double sum = 0;
		for(Product p: list) {
			if(c.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
