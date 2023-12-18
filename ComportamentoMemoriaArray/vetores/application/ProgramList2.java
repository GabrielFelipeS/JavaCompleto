package ComportamentoMemoriaArray.vetores.application;

import java.util.ArrayList;
import java.util.List;

public class ProgramList2 {
	public static void main(String[] args) {
		List<String> list;
		
		list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Amanda");
		list.add(2,"Marco");
		
		
		System.out.println(list.size());
		
		list.remove(1);
		for(String s: list) {
			System.out.println(s);
		}
	}
}
