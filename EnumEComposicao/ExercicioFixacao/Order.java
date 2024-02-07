package EnumEComposicao.ExercicioFixacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public void addItem(String nameProduct, double priceProduct, int quantity) {
		addItem(new OrderItem(new Product(nameProduct, priceProduct), quantity));
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		return items.stream().mapToDouble(i -> i.subTotal()).sum();
	}
	
	public String momentFormated() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return formatter.format(moment);
	}

	public String getStatus() {
		return status.toString();
	}

	public String getClient() {
		return client.toString();
	}

	public void printItens() {
		items.stream().forEach(i -> System.out.println(i.toString()));
	}
	

}
