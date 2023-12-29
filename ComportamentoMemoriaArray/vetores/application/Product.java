package ComportamentoMemoriaArray.vetores.application;

public class Product {
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public static String staticUpperName(Product p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticUpperName() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return String.format("%s %.2f", name, price);
	}
}
