package Java8Interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ford {
	public static void main(String[] args) {
		
		int[] a= {1,3,4,8,0,9,0};
		int[] b= {2,0,5,7,6,0,0};
		
		List<int[]> l=List.of(a,b);
				
		//		output = [1,2,3,4,5,6,7,8,9,0,0,0,0]
		
		
		
		List<Integer> merged=l.stream().flatMap(i->Arrays.stream(i).boxed()).sorted().filter(i->i!=0).toList();
		
		
		var l1=new ArrayList<>();
		l1.addAll(merged);
		l1.addAll(IntStream.rangeClosed(0, (a.length+b.length)-merged.size()).boxed().map(i->0).toList());
		System.out.println(l1);
	
		
	}
}
