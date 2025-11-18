package Java8Interview_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BNB {
	public static void main(String[] args) {
		
		String s="Antony";
		List<String> list=Arrays.asList(s.split(""));
		list.stream().filter(i->Collections.frequency(list, i)>1).distinct().forEach(System.out::print);
	
	}

}
