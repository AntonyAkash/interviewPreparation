package Arrayss;

import java.util.stream.IntStream;

public class sumofElementysinArray {
	public static void main(String[] args) {
		int[] arr=IntStream.rangeClosed(0, 4).toArray();
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
