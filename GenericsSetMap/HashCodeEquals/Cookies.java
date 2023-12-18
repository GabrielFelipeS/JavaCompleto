package GenericsSetMap.HashCodeEquals;

import java.util.Map;
import java.util.TreeMap;

public class Cookies {
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		cookies.put("phone", "99711133");
		
		cookies.remove("email");

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number:" + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		System.out.println("ALL COOKIES:");
		for(String key: cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		System.out.println("\nALL COOKIES KEY:");
		for(String string: cookies.keySet()) {
			System.out.println(string);
		}
		
		System.out.println("\nALL COOKIES VALUES:");
		for(String value: cookies.values()) {
			System.out.println(value);
		}
	}
}
