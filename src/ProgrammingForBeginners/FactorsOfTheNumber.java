package ProgrammingForBeginners;

import java.util.stream.IntStream;

public class FactorsOfTheNumber {
    public static void main(String[] args) {
        int n = 30;
        int i = 1;

        System.out.print("Factors are ");

        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
            i++;
        }
        
        var v=IntStream.rangeClosed(1, 30).boxed().filter(a->30%a==0).toList();
        System.out.println(v);
    }
}
