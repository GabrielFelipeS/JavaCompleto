package EnumEComposicao.ExercicioFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Application {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = scan.nextLine();
		
		System.out.print("Email: ");
		String email = scan.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Birth date (dd/MM/yyyy): ");
		Date date = sdf.parse(scan.next());
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(scan.next());
		
		Client client = new Client(name, email, date);
		Order order = new Order(LocalDateTime.now(), status, client);
		
		System.out.println("How many items to this order? ");
		int itens = scan.nextInt();
		for(int i = 0;i < itens; i++) {
			scan.nextLine();
			System.out.printf("Enter #%d item: data\n", i + 1);
			System.out.print("Prduct name: ");
			String nameProduct = scan.nextLine();
			
			System.out.print("Prduct price: ");
			double priceProduct = scan.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = scan.nextInt();
			
			order.addItem(nameProduct, priceProduct, quantity);
		}
		
		System.out.println("\nORDR SUMMARY: ");
		System.out.println("Order moment " + order.momentFormated());
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + order.getClient());
		System.out.println("Order itens: ");
		order.printItens();
		System.out.println("Total price : $" + order.total());
		
		scan.close();
	}
}
