package Arrayss;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
public static void main(String[] args) {
	
	int[] arr= {1, 2, 3, 4, 5,6};
	
	for(int i=0;i<arr.length/2;i++) {
		int temp=arr[i];
		arr[i]=arr[arr.length-i-1];
		arr[arr.length-i-1]=temp;
	}
	
	System.out.println(Arrays.toString(arr));
	
	System.out.println("-----------------------------------------------");
	
	int[] arr2= {1, 2, 3, 4, 5,6};
	
	int minIndex=0;
	int maxIndex=arr2.length-1;
	
	while(minIndex<maxIndex) {
		int temp=arr2[minIndex];
		arr2[minIndex]=arr2[maxIndex];
		arr2[maxIndex]=temp;
		minIndex++;
		maxIndex--;
	}
	System.out.println(Arrays.toString(arr2));
	
	System.out.println("-----------------------Java 8------------------------");
	
	int[] arr3= {1, 2, 3, 4, 5,6};
	var arr4=IntStream.range(0, arr3.length).map(i->arr3[arr3.length-i-1]).toArray();
	System.out.println(Arrays.toString(arr4));
   
}
}
