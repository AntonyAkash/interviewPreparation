package Java8Interview_questions;

import java.util.Arrays;
import java.util.Map;

import DSA.HashMap;

public class Phenom {
	public static void main(String[] args) {
		int[] a = {3, 5, 7, 2, 3, 8};
		int target = 6;
		int[] result=getResultArray(a,target);
		System.out.println(Arrays.toString(result));
		
		String[] s={"Snake", "Snowball", "Apple", "Orange"};
		var listOfStringsStartsWithS=Arrays.stream(s).filter(i->i.toLowerCase().startsWith("s")).toList();
		System.out.println(listOfStringsStartsWithS);
		
	}
	
	public static int[] getResultArray(int[] arr,int target){
		//map
		Map<Integer,Integer> map=new java.util.HashMap<>();//integer Index
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
	    }
		
		for(int i=0;i<arr.length;i++) {
			//find number to find in map
			int numberToFind=target-arr[i];
			
			if(map.containsKey(numberToFind) && map.get(numberToFind)!=i) {
				  return new int[]{arr[i],numberToFind};
				}
			}
		return new int[]{-1};
			
	    }
	

}
