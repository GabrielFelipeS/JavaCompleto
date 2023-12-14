package GenericsSetMap.HashCodeEquals;

public class Program {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Gabriel", "gabriel@gmail.com");
		Cliente c2 = new Cliente("Gabriel", "gabriel@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	}
}
