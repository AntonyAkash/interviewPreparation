package Java8Interview_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Wavicle {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3 ,2 ,4 ,7 ,8 ,10,13).stream().sorted().distinct().toList();
		//System.out.println(list);
		int temp=list.get(0);
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i+1)-list.get(i)!=1) {
				if(i+1==list.size()-1) {
					System.out.print(temp + "-"+list.get(i+1)+",");
				}else {
					System.out.print(temp + "-"+list.get(i)+",");
				}
				temp=list.get(i+1);
				
			}
		}
		
	}

}
