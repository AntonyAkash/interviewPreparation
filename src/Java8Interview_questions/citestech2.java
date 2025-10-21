package Java8Interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class citestech2 {
  public static void main(String[] args) {
			List<String> list=Arrays.asList("India is county of diversities county".split(" "));
			Map<String,Long>map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			System.out.println(map);	
		};

}
