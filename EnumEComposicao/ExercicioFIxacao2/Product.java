package EnumEComposicao.ExercicioFIxacao2;

public class Product {
	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String priceTag() {
		return name;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("%s $ %.2f", name, price);
	}
}
