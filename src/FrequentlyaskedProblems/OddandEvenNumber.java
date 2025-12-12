package FrequentlyaskedProblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddandEvenNumber {
public static void main(String[] args) {
	Map<Boolean,List<Integer>> map=IntStream.rangeClosed(0, 10).boxed().collect(Collectors.partitioningBy(i->i%2==0));
	
	List<Integer> even=map.get(true);
	List<Integer> odd=map.get(false);
	System.out.printf("even :%s",even);
	System.out.printf("odd : %s",odd);
}
}
