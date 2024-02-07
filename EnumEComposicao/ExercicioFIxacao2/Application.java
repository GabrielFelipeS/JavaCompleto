package EnumEComposicao.ExercicioFIxacao2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int numberOfProducts = scan.nextInt();
		
		List<Product> products = new ArrayList<>();
		
		for(int i = 0;i < numberOfProducts; i++) {
			scan.nextLine();
			
			System.out.printf("Product #%d data: \n", i + 1);
			System.out.print("Common, used of imported (c/u/i): ");
			char type = scan.nextLine().toLowerCase().charAt(0);
			
			System.out.print("Name: ");
			String name = scan.nextLine();
			
			System.out.print("Price: ");
			double price = scan.nextDouble();
			
			Product product;
			if(type == 'i') {
				System.out.print("Customs Fee: ");
				double customsFee = scan.nextDouble();
				product = new ImportedProduct(name, price, customsFee);
				
			} else if(type == 'u') {
				System.out.print("Manufacture date (dd/MM/yyyy): ");
				Date date = sdf.parse(scan.next());
				product = new UsedProduct(name, price, date);
				
			} else {
				product = new Product(name, price);
			}
			
			products.add(product);
		}
		
		System.out.println("PRICE TAGS");
		products.stream().forEach(p -> System.out.println(p.toString()));
	}
}
