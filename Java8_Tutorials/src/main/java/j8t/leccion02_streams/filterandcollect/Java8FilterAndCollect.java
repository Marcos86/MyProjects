package j8t.leccion02_streams.filterAndCollect;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

/**
 * The Class Java8FilterAndCollect.
 */
public class Java8FilterAndCollect {
	
	/**
	 * Filter example.
	 */
	public static void example() {

		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		
		System.out.println("Java8FilterAndCollect - JAVA 8 EXAMPLE:");

		List<String> result = lines.stream() 			//convert list to stream
			.filter(line -> !"mkyong". equals (line))	//filters the line, equals to "mkyong"
			.collect(Collectors.toList());			//collect the output and convert streams to a List

		result.forEach(System.out::println);			//output : spring node
		
		System.out.println("**************************");
		System.out.println("");
	}



}
