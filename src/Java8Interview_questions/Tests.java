package Java8Interview_questions;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Tests {
	public static void main(String[] args) {
		
		//consumer
		Consumer<Integer> c=i->System.out.println(i);
		c.accept(1);
		//supplier
		
		Supplier<Stream<String>> s=()-> Stream.of(new String[] {"Antony","Immanuel"});
		s.get().forEach(System.out::println);
		
		
		List<Integer> list=List.of(1,2,3,4,5,5,3,2,1);
		var maxVal=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println(maxVal);
		
		
	}

}
