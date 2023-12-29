package ProgramacaoFuncionalEExpressaoLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import ComportamentoMemoriaArray.vetores.application.Product;

public class FuncoesComFuncoesComoParametro {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		double sum = 0;
		//sum = ps.filteredSum(list, p -> p.getName().toUpperCase().charAt(0) == 'M');
		//sum = ps.filteredSum(list, p -> p.getName().toUpperCase().charAt(0) == 'M');
		
		sum = ps.filteredSum(list, p -> p.getPrice() < 100);
		
		System.out.println(String.format("Sum = %.2f", sum));
	}
}
