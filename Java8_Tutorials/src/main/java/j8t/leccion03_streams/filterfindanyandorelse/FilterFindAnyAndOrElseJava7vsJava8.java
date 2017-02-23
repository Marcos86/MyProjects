package j8t.leccion03_streams.filterfindanyandorelse;

/**
 * The Class StreamsFilterAndCollect.
 * Link ejemplo: https://www.mkyong.com/java8/java-8-streams-filter-examples/
 */

public class FilterFindAnyAndOrElseJava7vsJava8 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Java7FilterFindAnyAndOrElse.example();
		Java8FilterFindAnyAndOrElse.exampleSingleCondition();
		Java8FilterFindAnyAndOrElse.exampleMultipleCondition();
		Java8FilterFindAnyAndOrElse.exampleFilterAndMap();
	}

}
