package ProgramacaoFuncionalEExpressaoLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Pipeline {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> st1 = list.stream().map(i -> i * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Somatorio: " + sum);
		
		Stream.iterate(0, i -> i + 2).forEach(System.out::println);
	}
}
