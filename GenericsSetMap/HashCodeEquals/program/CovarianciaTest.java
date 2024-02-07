package GenericsSetMap.HashCodeEquals.program;

import java.util.ArrayList;
import java.util.List;

public class CovarianciaTest {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		List<Number> NumberList = new ArrayList<Number>();
		List<? extends Number> list = intList;
		list = NumberList;
		
		// list.add(29);
	}
}
