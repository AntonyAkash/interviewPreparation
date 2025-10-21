package Java8Interview_questions;

import java.util.HashMap;
import java.util.Map;

public class Deloite {
  public static void main(String[] args) {
	Map<String, Integer> map=Map.of(
	  "apple", 3,
	  "banana", 1,
	  "orange", 2
	);
	Map<String, Integer> map2=Map.of(
			  "apple", 4,
			  "banana", 1,
			  "orange", 1
			);
	Map<String,Integer> m=new HashMap<>();
	for(String s:map.keySet()) {
		if(map2.containsKey(s)) {
			m.put(s, map.get(s) - map2.get(s));
		}
	}
	System.out.println(m);
}
}
