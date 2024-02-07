package IntroducaoAPOO;

public class Product implements Comparable<Product> {
	String name;
	Double price;
	int quantity;
	
	public Product() {
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	double totalValueInStock() {
		return this.price * this.quantity;
	}
	
	void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	

	private Double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return String.format("%s, $ %.2f, %d units, Total: $ %.2f", name, price, quantity, totalValueInStock());
	}
	
	@Override
	public int compareTo(Product other) {
		return price.compareTo(other.getPrice());
	}

}
