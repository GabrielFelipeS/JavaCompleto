package EnumEComposicao.ExercicioFIxacao2;

public class ImportedProduct extends Product{
	private Double customsFee;
	
	public String priceTag() {
		return "";
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return getPrice() +  customsFee;
	}
	
	@Override
	public String toString() {
		return String.format("%s $ %.2f (Customs fee: %.2f)", getName(), totalPrice(), customsFee);
	}
}
