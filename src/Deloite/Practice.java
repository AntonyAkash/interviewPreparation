package Deloite;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {
	public static void main(String[] args) {
		
		  String[] inp="hello world".split(" "); String rev=""; 
		  for(String name:inp) {
		  rev+=IntStream.range(0,
		  name.length()).boxed().map(i->String.valueOf(name.charAt(name.length()-i-1)))
		  .collect(Collectors.joining())+" "; 
		  }
		  
		  System.out.println(rev.trim());
		 
		Integer n=Arrays.asList(1,3,2,2,3,4,4,5,5).stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	   System.out.println(n);
	}
}
