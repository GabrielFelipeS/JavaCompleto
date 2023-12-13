package IntroducaoAPOO;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Product produto = new Product();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Name: ");
		produto.name = scan.nextLine();
		
		System.out.print("Price: ");
		produto.price = scan.nextDouble();

		System.out.print("Quantity in stock: ");
		produto.quantity = scan.nextInt();
		
		System.out.println("Product data: " + produto.toString());
		
		int aux;
		System.out.println("Enter the number of products to be added in stock: ");
		aux = scan.nextInt();
		produto.addProducts(aux);	
		System.out.println("Updated data: " + produto.toString());
		
		System.out.println("Enter the number of products to be removed in stock: ");
		aux = scan.nextInt();
		produto.removeProducts(aux);
		System.out.println("Updated data: " + produto.toString());
	}
}
