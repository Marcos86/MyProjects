package j8t.leccion02_streams.filterandcollect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java7FilterAndCollect {
	

	public static void example() {
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		List<String> result = getFilterOutput(lines, "mkyong");
		System.out.println("Java7FilterAndCollect - JAVA 7 EXAMPLE:");
		for (String temp : result) {
			System.out.println(temp);	//output : spring node
		}
		System.out.println("**************************");
		System.out.println("");
	}

	/**
	 * Gets the filter output.
	 *
	 * @param lines the lines
	 * @param filter the filter
	 * @return the filter output
	 */
	private static List<String> getFilterOutput (List<String> lines, String filter) {
		List<String> result = new ArrayList<String>();
		for (String line : lines) {
			if (!"mkyong".equals(line)) {
				result.add(line);
			}
		}
		return result;
	}

}
