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
		.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

	// Sorting the map by values
	map.entrySet().stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	
	// Sorting the map by values in reverse order
	map.entrySet().stream()
		.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
		.forEach( System.out::println);
   
	// Sorting the map by keys in reverse order
	map.entrySet().stream()
		.sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
		.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	// Sorting the map by keys and then by values coorrect the below code	
	map.entrySet().stream()
		.sorted(Comparator.comparing(Map.Entry<String,Integer>::getKey)
			.thenComparing(Map.Entry<String,Integer>::getValue))
		.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
 }
}
