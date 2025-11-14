package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AVGmarks {
	public static void main(String[] args) {
        String[] records = { "3-hindi:50","1-english:45", "2-english:35", "3-hindi:50"};

        //Arrays.stream(records).map(rec->rec.split(":")).forEach(i->System.out.println(i[0].substring(i[0].indexOf("-"))));
        
        Map<String, Double> map=Arrays.stream(records).map(i->i.split(":")).collect(Collectors.groupingBy(i->i[0].substring(i[0].indexOf('-')+1),TreeMap::new,
        		Collectors.averagingDouble(i->Integer.valueOf(i[1]))));
        
        System.out.println(map);
        
 }
}


/*
 * public static void main(String[] args) { String[] records = {"1-english:45",
 * "2-english:35", "3-hindi:50"};
 * 
 * //Arrays.stream(records).map(rec->rec.split(":")).forEach(i->System.out.
 * println(i[0].substring(i[0].indexOf("-"))));
 * 
 * Map<String, List<Integer>>
 * subjectMarks=Arrays.stream(records).map(rec->rec.split(":"))
 * .collect(Collectors.groupingBy(i->i[0].substring(i[0].indexOf('-')+1),TreeMap
 * ::new,Collectors.mapping(i->Integer.valueOf(i[1]),Collectors.toList())));
 * System.out.println(subjectMarks);
 * 
 * Map<String, Double>
 * subjectAverages=subjectMarks.entrySet().stream().collect(Collectors.toMap(Map
 * .Entry::getKey,i->i.getValue().stream().collect(Collectors.averagingDouble(
 * Integer::doubleValue)),(a,b)->a,TreeMap::new));
 * 
 * }
 */