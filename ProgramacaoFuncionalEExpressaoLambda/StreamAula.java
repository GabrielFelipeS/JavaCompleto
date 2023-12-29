package ProgramacaoFuncionalEExpressaoLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAula {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<Integer> st2 = list.stream().map(p -> p * 10);
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<String> st3 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st3.toArray()));
		
		Stream<Integer> st4 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
		Stream<Long> st5 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]})
				.map(p -> p[0]);
		System.out.println(Arrays.toString(st5.limit(10).toArray()));
		
		Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]})
				.limit(10).forEach(p -> System.out.println(p[0] + " = " + p[1]));
	}
}
