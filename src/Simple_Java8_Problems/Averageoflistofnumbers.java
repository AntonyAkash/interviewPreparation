package Simple_Java8_Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Averageoflistofnumbers {
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 100);
        Double sum = list.stream()
                         .mapToInt(i -> i)
                         .average()
                         .getAsDouble();
        System.out.println(sum);
        Double sums=list.stream().collect(Collectors.averagingDouble(Integer::valueOf));
        System.out.println(sums);
    }
}
