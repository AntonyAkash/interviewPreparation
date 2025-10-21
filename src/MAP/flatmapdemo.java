package MAP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatmapdemo {
	
	public static void main(String[] args) {
		
		//map -------------------------------------------------
		List<String> list = Arrays.asList("Antony", "John","Vineeth","Vine");
        
        List<Stream<String>> listOfStreams = list.stream()
        	    .map(i -> Arrays.stream(i.split("")))
        	    .collect(Collectors.toList());
        

        	System.out.println(listOfStreams);//[java.util.stream.ReferencePipeline$Head@50cbc42f, java.util.stream.ReferencePipeline$Head@75412c2f]
        	//normal map will create list stream
        	
        //flatmap -----------------------------------------------
        //step 2  used to create list of streams and then flatten them into a single stream
	        List<String> namess = Arrays.asList("Antony", "John","Vineeth","Vine");

	        // flatMap: split each name into chars, then flatten
	        List<String> chars = namess.stream()
	            .flatMap(i -> Arrays.stream(i.split(""))).collect(Collectors.toList());

	        System.out.println(chars);//[A, n, t, o, n, y, J, o, h, n, V, i, n, e, e, t, h, V, i, n, e]
	    }
	

}
