package Arrayss;

import java.util.Arrays;

public class ReverseAnArrayInGroupsOfGiovenSize {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8};
		int k=4;
		reverse(arr, k);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void reverse(int[] arr,int k) {
		int len=arr.length;
		for(int i=0;i<len;i=i+k) {//to separate K elements
			int start=i;
			int end=Math.min(i+k-1, len-1);//to find end of array of size k
			while(start<=end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				
				start++;
				end--;
			}
		}
		
		
	}

}
