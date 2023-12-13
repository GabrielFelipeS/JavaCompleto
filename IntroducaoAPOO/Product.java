package IntroducaoAPOO;

public class Product {
	String name;
	double price;
	int quantity;
	
	double totalValueInStock() {
		return this.price * this.quantity;
	}
	
	void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	@Override
	public String toString() {
		return String.format("%s, $ %.2f, %d units, Total: $ %.2f", name, price, quantity, totalValueInStock());
	}
}
