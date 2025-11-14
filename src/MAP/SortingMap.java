package MAP;

import java.util.Map;
import java.util.Comparator;

public class SortingMap {
  public static void main(String[] args) {
	  // Example map to sort
	Map<String, Integer> map = Map.of(
	  "apple", 3,
	  "banana", 1,
	  "orange", 2
	);

	// Sorting the map by keys
	map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);

	// Sorting the map by values
	map.entrySet().stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
	
	// Sorting the map by values in reverse order
	map.entrySet().stream()
		.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
		.forEach( System.out::println);
   
	// Sorting the map by keys in reverse order
	map.entrySet().stream()
		.sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
		.forEach(System.out::println);
	System.out.println("----------------------------------");
	// Sorting the map by keys and then by values coorrect the below code	
	map.entrySet().stream()
		.sorted(Map.Entry.<String,Integer>comparingByKey().thenComparing(Map.Entry.<String,Integer>comparingByValue().reversed()))
		.forEach(System.out::println);
 }
}
