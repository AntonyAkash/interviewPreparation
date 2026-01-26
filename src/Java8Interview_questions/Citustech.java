package Java8Interview_questions;

import java.util.stream.IntStream;

public class Citustech {
    public static void main(String[] args) {
    	String input="developer";
        IntStream.range(0,input.length()).limit(input.length()/2+1)
        .forEach(i->System.out.println(String.valueOf(input.charAt(i))+String.valueOf(input.charAt(input.length()-1-i))));
    }
}
