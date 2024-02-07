package GenericsSetMap.HashCodeEquals.program;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Contravariancia {
	public static void main(String[] args) {
		List<Object> myObj = new ArrayList<Object>();
		myObj.add("Maria");
		myObj.add("Alex");
		
		List<? super Number> list = myObj;
		
		list.add(29);
		list.add(29.9);
		
	//	Number x = list.get(0);
	}
}
