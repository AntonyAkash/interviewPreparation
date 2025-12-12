package String;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountOfEachWord {
	public static void main(String[] args) {
		String name="Antoyn Immanuel Antoyn Immanuel";
		 Map<String,Long> map=Arrays.stream(name.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(map);
	}

}
