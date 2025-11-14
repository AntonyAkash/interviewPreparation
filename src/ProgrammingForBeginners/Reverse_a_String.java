package ProgrammingForBeginners;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverse_a_String {
	public static void main(String[] args) {
        String[] s = "TataConsultancy".split("");
        String reversedstring = "";
        System.out.println(reversedstring);
        
        String ss="ataConsultancy";
       var name =IntStream.range(0,ss.length()).boxed().map(i->String.valueOf(ss.charAt(ss.length()-i-1))).collect(Collectors.joining());
       System.out.println(name);
      
    }
}
