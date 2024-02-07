package ComportamentoMemoriaArray.vetores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		Map<String, Integer> map = phrase("testing, 1, 2 testing");
		for(Map.Entry<String, Integer> m: map.entrySet()) {
			System.out.println(m.getKey() + "=" + m.getValue());
		}
	}
	
	public static Map<String, Integer> phrase(String input) {
		 Map<String, Integer> map = new HashMap<String, Integer>();
	        char anterior = ' ';
	        StringBuilder builder = new StringBuilder();
	        List<String> split = new ArrayList<>();
	  
	        for(char c: input.toLowerCase().toCharArray()) {
	        	//System.out.print(c);
	            if(Character.isLetter(c) || Character.isDigit(c)) {
	            	builder.append(c);
	       
	            } else if(c == '\'' && !Character.isWhitespace(anterior)) {
	            	builder.append(c);
	            	
	            } else if((Character.isWhitespace(c) || c == ',')) {	            	
	            	if(builder.length() != 0) {
	            		split.add(builder.toString());
	            	
		            	builder.delete(0, builder.length());
	            	}            	
	            }
	            anterior = c;
	        }
	        //System.out.println();
	        split.add(builder.toString());
	      
	        for(String s: split){
	            int num = 0;
	            
	            if(s.charAt(s.length() - 1) == '\'') {
	            	s = s.substring(0, s.length() - 1);
	            }
	            
	            if(map.containsKey(s)) {
	                num = map.get(s);
	            }
	            map.put(s, num + 1);
	        }
	        input.contains("-");
	        new StringBuilder(input.toLowerCase()).chars().distinct().count();
	        
	        return map;
	}
}
