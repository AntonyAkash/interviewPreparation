package comcast;

import java.util.stream.IntStream;

public class Infosys {
	public static void main(String[] args) {
		int n=5;
		long c=IntStream.rangeClosed(1, n).boxed().reduce((a,b)->a*b).get(); //factorial of the numbers
		System.out.println(c);
	}
}
