package comcast;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Athena {
	
public static void main(String[] args) {

	//problem is c alled as anagram
	String one="aabbcc";
	String two="abbcca";
	if(Arrays.stream(one.split("")).sorted().collect(Collectors.joining()).equals(Arrays.stream(one.split("")).sorted().collect(Collectors.joining()))) {
		System.out.printf(" %s and %s are anagrams",one,two);
	}else {
		System.out.println("Not an anagram");
	}

 }
}
