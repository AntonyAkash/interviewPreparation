package Arrayss;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DublicateElemetsInaArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4,5,5};
		var list=Arrays.stream(arr).boxed().toList();
		list.stream().filter(i->Collections.frequency(list,i)>1).distinct().forEach(System.out::println);
		
		list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(i->i.getValue()>1).map(i->i.getKey()).forEach(System.out::println);
	}

}
