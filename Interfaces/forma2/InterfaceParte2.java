package Interfaces.forma2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Interfaces.forma2.model.services.BrazilTaxService;
import Interfaces.forma2.model.services.RentalService;

public class InterfaceParte2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = scan.nextLine();
		System.out.println("Retirada (dd/MM/yyyy HH:mm)");
		LocalDateTime start = LocalDateTime.parse(scan.nextLine(), dtf);
		System.out.println("Retorno (dd/MM/yyyy HH:mm)");
		LocalDateTime finish = LocalDateTime.parse(scan.nextLine(), dtf);
		
		CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Entre o preço por hora: ");
		double pricePerHour = scan.nextDouble();
		
		System.out.print("Entre o preço por dia: ");
		double pricePerDay = scan.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(carRental);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento basico: " + carRental.getInvoice().getBasicPayment());
		System.out.println("Imposto: "  + carRental.getInvoice().getTax());
		System.out.println("Pagamento toal: "  + carRental.getInvoice().getTotalPayment());
		
		
		scan.close();
	}
}
