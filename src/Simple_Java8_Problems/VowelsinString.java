package Simple_Java8_Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelsinString {
	public static void main(String[] args) {
        List<String> name = Arrays.asList("Ant onio uy".strip().split(""));
        var n=name.stream().filter(i->i.toLowerCase().matches("a|e|i|o|u")).toList();
        System.out.println(n);
    }
}
