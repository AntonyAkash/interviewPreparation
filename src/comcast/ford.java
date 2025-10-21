package comcast;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ford {
	public static void main(String[] args) {
	
		List<String> list=Arrays.asList("Mustach Mach E is best EV right now".replaceAll(" ","").split(""));
		Map<String,Long> map=list.stream().map(String::toLowerCase).filter(i->i.toLowerCase().matches("a|e|i|o|u")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		
		/*
		 * list.stream().sorted(Comparator.comparing(Employee::getName).
		 * thenComparingDouble(Employee::getSalary).reversed()).toList(); double
		 * d1=2.00; double d2=2.00; int epsilon=e-9; if(d1-d2<epsilon) {
		 * System.out.println("d1 and d2 equals"); }
		 */
	    
	}

}
