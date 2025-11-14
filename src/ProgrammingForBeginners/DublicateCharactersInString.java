package ProgrammingForBeginners;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DublicateCharactersInString {
	public static void main(String[] args) {
        // duplicate characters in string
        String s = "abcabxcyz";
        char[] c = s.toCharArray();
        String result = "";

        for (int i = 0; i < c.length - 1; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    result += c[j];
                }
            }
        }
        System.out.println(result);
        
        var name =Arrays.asList(s.split("")).stream().filter(i->Collections.frequency(Arrays.asList(s.split("")),i)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(name);
        
    }

}
