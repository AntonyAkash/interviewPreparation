package practice;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AVGmarks {
	public static void main(String[] args) {
        String[] records = { "3-hindi:50","1-english:45", "2-english:35", "3-hindi:50"};
        
      Map<String,Double> map=Arrays.stream(records).map(record->record.split(":")).collect(Collectors.groupingBy(i->i[0].substring(i[0].indexOf('-')+1),TreeMap::new,Collectors.averagingDouble(i->Integer.valueOf(i[1]))));
      System.out.println(map);
    
 }
}