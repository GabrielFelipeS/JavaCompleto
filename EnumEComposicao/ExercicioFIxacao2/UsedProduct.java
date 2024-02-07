package EnumEComposicao.ExercicioFIxacao2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return String.format("%s $ %.2f (Manufacture date: %s)", getName(), getPrice(), sdf.format(manufactureDate));
	}
}
