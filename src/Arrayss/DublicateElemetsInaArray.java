package Arrayss;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.print.attribute.HashAttributeSet;

import DSA.HashMap;

public class DublicateElemetsInaArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4,5,5};
		var list=Arrays.stream(arr).boxed().toList();
		list.stream().filter(i->Collections.frequency(list,i)>1).distinct().forEach(System.out::println);
		System.out.print("______________________________________________________________\n");
		
		list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(i->i.getValue()>1).map(i->i.getKey()).forEach(System.out::println);
		
		System.out.print("______________________________________________________________\n");
        Map<Integer,Integer> map=new java.util.HashMap();
		for(int i:arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		map.entrySet().stream().filter(i->i.getValue()>1).map(i->i.getKey()).forEach(System.out::println);
		
	}

}
