package String;

import java.util.Arrays;

public interface Anagram {
  public static void main(String[] args) {
	String a="abbc";
	String b="abcb";
    if((Arrays.stream(a.split("")).sorted().toList()).equals(Arrays.stream(b.split("")).sorted().toList()))
    	System.out.printf("%s and %s are Anagarm", a,b);
    else
    	System.out.printf("%s and %s are not Anagarm", a,b);
    
}
}
