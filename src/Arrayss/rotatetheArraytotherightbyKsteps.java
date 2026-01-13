package Arrayss;

import java.util.Arrays;

public class rotatetheArraytotherightbyKsteps {
	public static void main(String[] args) {
		int[] arr= {1,2,3,8,9,10,11};
		int k=3;
		rotatebyK(arr,k);
		System.out.println(Arrays.toString(arr));
		}
		
	
	private static void rotatebyK(int[] arr,int k) {
		int len=arr.length;
		k=k%len; ///recalculate k 3 % 7 = 3  a % b = a   (when a < b)
		System.out.println(k);
		reverse(0,len-k-1,arr);
		reverse(len-k,len-1,arr);
		reverse(0,len-1,arr);
		
		
	}
	
	private static void reverse(int start,int end, int[] arr) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
	}
		
			
	}




	/* brute fore approach timecomplexity o(n2)
	 * public static void main(String[] args) { int[] arr= {1,2,3,8,9,10}; int k=3;
	 * while(k>0) { int temp =arr[arr.length-1];//last value of an arry for(int
	 * i=arr.length-2;i>=0;i--) { arr[i+1]=arr[i]; } arr[0]=temp; k--; }
	 * 
	 * System.out.println(Arrays.toString(arr));
	 * 
	 * }
	 */

