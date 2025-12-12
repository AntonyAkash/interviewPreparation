package Arrayss;

import java.util.Arrays;

public class MissingNumberInanArray {
	public static void main(String[] args) {
		int[] arr= {1,2,5,4};
		Arrays.sort(arr);
		int min=arr[0];
		for(int a: arr) {
			if(a==min) {
				min++;
			}else {
				System.out.println(min);
				break;
			}
		}
	}

}
