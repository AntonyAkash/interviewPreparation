package Arrayss;

import java.util.Arrays;
import java.util.List;

public class MissingNumbersInArrayWithoutSorting {
	public static void main(String[] args) {
		int[] arr= {6,5,4,2};
		int xor1=0;
		int xor2=0;
		
		int min=arr[0];
		int max=arr[0];
		for(int i:arr) {
			if(i<min)
				min=i;
			if(i>max)
				max=i;
		}
		//using xor---------------------------------------
		
		for(int i=min;i<=max;i++) { 
			xor1^=i;//contains xor of all numbers imcluding missing numbers  //2^3^4^5^6
		}
		
		for(int i: arr) {
			xor2^=i;//contains xor of all elements in array excuding missing element //2^4^5^6
		}
		
		int missingNumber=xor1^xor2;//(2^3^4^5^6)^(^4^5^6)=3 //same elements while exor becomes 0 so missing number alone will be left alone
		
		System.out.printf("Missing number is %d \n", missingNumber);
		
		
		//using max and min----------------------------------------------------------
		//simple method
		List<Integer> list =Arrays.stream(arr).boxed().toList();
		for(int i=min;i<=max;i++) { 
			if(!list.contains(i)) {
				System.out.println("Missing number is "+i);
				break;
			}
		}
		
	}

}
