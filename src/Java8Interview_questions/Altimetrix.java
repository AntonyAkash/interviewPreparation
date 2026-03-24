package Java8Interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Altimetrix {
	public static void main(String[] args) {
		
	
		/*
		 * Arrays.stream("Programming".toLowerCase().split("")).collect(Collectors.
		 * groupingBy(Function.identity(),Collectors.counting()))
		 * .entrySet().stream().filter(i->i.getValue()>1).forEach(System.out::println);
		 */
		
		/*
		 * Given an array of integers nums and an integer target, return indices of the
		 * two numbers such that they add up to target. You may assume that each input
		 * would have exactly one solution, and you may not use the same element twice.
		 * You can return the answer in any order.
		 * 
		 * Input: nums = [2,7,11,15], target = 9 Output: [0,1]
		 * 
		 * Input: nums = [3,2,4], target = 6 Output: [1,2]
		 */
		
		int[] arr= {5,7,3,2};
		var a=Arrays.stream(arr).boxed().filter(i->i%2==0).toList();
		int target=9;
		int[] matchingIndexes=findIndexThatSumsToTarget(arr,target);
		System.out.println(Arrays.toString(matchingIndexes));
			
			
	}
	
	private static int[] findIndexThatSumsToTarget(int[] arr,int target) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					return new int[]{i,j};
				}
			}
			
		}
		return new int[] {0};
	}
	
}
