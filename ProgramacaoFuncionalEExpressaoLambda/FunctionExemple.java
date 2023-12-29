package ProgramacaoFuncionalEExpressaoLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import ComportamentoMemoriaArray.vetores.application.Product;

public class FunctionExemple {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Forma 1 - Criando uma classe que implemente o Function
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		// Forma 2  - Usando um metodo estatico
		//List<String> names = list.stream().map(Product::staticUpperName).collect(Collectors.toList());
		
		// Forma 3 - Usando um metodo de instancia
		//List<String> names = list.stream().map(Product::nonStaticUpperName).collect(Collectors.toList());
		
		// Forma 4 - Usando um function declarada
		//Function<Product, String> function = (p) -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(function).collect(Collectors.toList());
		
		// Forma 5 - Usando lambda inline
		List<String> names = list.stream().map((p) -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}
