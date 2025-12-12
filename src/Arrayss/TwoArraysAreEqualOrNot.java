package Arrayss;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoArraysAreEqualOrNot {
   public static void main(String[] args) {
	var a=IntStream.range(0, 5).toArray();
	int[] b=IntStream.rangeClosed(0, 5).toArray();
	
	//way one
	System.out.println(Arrays.equals(a, b));
	
	//way two
	boolean equal=true;
	if(a.length==b.length) {
	for(int i=0;i<a.length;i++) {
	  if(a[i]!=b[i]) {
		  equal=false;
		  break;
	  }
	  
	}
	
	}else {
		equal=false;
	}
	if(equal) {
		System.out.println("Arrays Are equal");
		}else {
			System.out.println("Arrays Are Not equal");
		}
	
	
	
	
}
}
