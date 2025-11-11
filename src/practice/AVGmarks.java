package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AVGmarks {
	public static void main(String[] args) {
        String[] records = {"1-english:45", "2-english:35", "3-hindi:50"};

        // Use Map<String, List<Integer>> to group marks by subject
        Map<String, Double> subjectAverages = Arrays.stream(records)
                .map(record -> record.split(":"))
                .collect(Collectors.groupingBy(
                        parts -> parts[0].substring(parts[0].indexOf('-') + 1), // extract subject
                        TreeMap::new, // sort by subject name
                        Collectors.averagingDouble(parts -> Integer.parseInt(parts[1])) // compute average
                ));
      
        System.out.println(subjectAverages);
        
	}
}
