package String;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class reverseWordsInString {
	
	public static void main(String[] args) {
		String s="Hello Java Word Welcome";
		IntStream.range(0, s.length()).boxed().map(i->String.valueOf(s.charAt(s.length()-i-1))).forEach(System.out::print); //emocleW droW avaJ olleH
		
		System.out.println(" -------------");
		//
		String[] arr=s.split(" ");
	    IntStream.range(0,arr.length).boxed().map(i->arr[arr.length-i-1]).forEach(i->System.out.print(i+" "));
	}

}
