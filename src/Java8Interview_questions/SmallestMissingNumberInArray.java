package Java8Interview_questions;

import java.util.Arrays;
import java.util.Comparator;

public class SmallestMissingNumberInArray {
	public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2, 7, 9, 6, 10};
        int max = Arrays.stream(arr).max().getAsInt();
        int max1 = Arrays.stream(arr).boxed().max(Comparator.comparing(Integer::valueOf)).get();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                System.out.println("Missing = " + (arr[i] + 1));
                break;
            }
        }
    }
}
