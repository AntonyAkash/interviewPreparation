package Deloite;

import java.util.Arrays;
import java.util.Comparator;

public class Ford {
	public static void main(String[] args) {
		Arrays.asList("1ab", "2cd", null, "4de", null, "3xy").stream()
		.sorted(Comparator.nullsFirst(Comparator.comparing(String::valueOf))).forEach(System.out::println);
		
	}

}
