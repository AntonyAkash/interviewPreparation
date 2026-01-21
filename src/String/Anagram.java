package String;

import java.util.Arrays;
import java.util.stream.Collectors;

public interface Anagram {
  public static void main(String[] args) {
	String a="abbc";
	String b="abcb  ";
    if((Arrays.stream(a.split("")).sorted().collect(Collectors.joining())).equals(Arrays.stream(b.split("")).sorted().collect(Collectors.joining())))
    	System.out.printf("%s and %s are Anagarm", a,b);
    else
    	System.out.printf("%s and %s are not Anagarm", a,b);
    
}
}
