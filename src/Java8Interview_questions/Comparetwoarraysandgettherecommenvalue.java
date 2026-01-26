package Java8Interview_questions;

import javax.xml.transform.stream.StreamSource;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Comparetwoarraysandgettherecommenvalue {
	 // find common elements between two given arrays
    public static void main(String[] args) {
        String[] s1 = {"Priyanka", "immanuel", "Shailaja", "krishna", "Rajesh"};
        String[] s2 = {"Priyanka", "immanuel", "Shailaja", "sharanya"};

        var l1=new java.util.ArrayList<>(Arrays.asList(s1));
        l1.retainAll(Arrays.asList(s2));
        System.out.println(l1);
        Set<String> set = new TreeSet<>();

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    set.add(s1[i]);
                }
            }
        }
        System.out.println(set);
    }
}
