package EnumEComposicao.ExercicioFixacao;

public class OrderItem {
	private Integer quantity;
	private double price;

	private Product product;

	
	public OrderItem(Product product, Integer quantity) {
		this(product, product.getPrice(), quantity);
	}
	
	public OrderItem(Product product, Double price ,Integer quantity) {
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}

	public Double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return String.format("%s, $%.2f, Quantity: %d, Subtotal: $%.2f", product.getName(), price, quantity, subTotal());
	}
}
