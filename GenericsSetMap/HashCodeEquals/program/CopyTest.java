package GenericsSetMap.HashCodeEquals.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyTest {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 2.8, 3.0, 4.76);
		List<Object> myObjs = new ArrayList<>();
		List<Number> myNums = new ArrayList<>();
		
		
		copy(myInts, myObjs);
		
		copy(myDoubles, myObjs);
		
		copy(myInts, myNums);
	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number item : source) {
			destiny.add(item);
		}
	}
	
	public static <T> void copy2(List<? extends T> source, List<T> destiny) {
		for(T item : source) {
			destiny.add(item);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
