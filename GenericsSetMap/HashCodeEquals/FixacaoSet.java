package GenericsSetMap.HashCodeEquals;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FixacaoSet {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		Set<Integer> set = new HashSet<>();
		studentsCourse("A" ,set);
		studentsCourse("B" ,set);
		studentsCourse("C" ,set);
		
		System.out.println("Total students: " + set.size());
	}
	
	public static void studentsCourse(String course, Set<Integer> set) {
		
		
		System.out.printf("How many students for course %s? ", course);
		
		int qtd = scan.nextInt();
		
		for(int i = 0;i < qtd; i++) {
			set.add(scan.nextInt());
		}
		
		//scan.close();
	}
}
