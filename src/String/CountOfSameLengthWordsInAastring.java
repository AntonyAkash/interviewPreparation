package String;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

import DSA.HashMap;

public class CountOfSameLengthWordsInAastring {
	public static void main(String[] args) {
		String s="Hello word 0ello".toLowerCase();
		
	    var ss=Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(String::length));
	    System.out.println(ss);
	}

}
