package comcast;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Athena {
	
public static void main(String[] args) {
	//Check if a String is Anagram

	//("listen" and "silent" → Anagrams)
	
	//romman numbers and there equalent values
	
	String one="aabbcc";
	String two="abbbcc";
	boolean b=false;
	/*
	 * Map<String,Long>
	 * map1=Arrays.asList(one.split("")).stream().collect(Collectors.groupingBy(
	 * Function.identity(),Collectors.counting())); Map<String,Long>
	 * map2=Arrays.asList(two.split("")).stream().collect(Collectors.groupingBy(
	 * Function.identity(),Collectors.counting())); if(map1.equals(map2)) { b=true;
	 * }
	 */
	if(Arrays.asList(one.split("")).stream().sorted().collect(Collectors.joining())
		.equals(Arrays.asList(two.split("")).stream().sorted().collect(Collectors.joining()))){
		b=true;
	}
	System.out.println(b);
 }
}
