package j8t.leccion03_streams.filterFindAnyAndRrElse;

import java.util.Arrays;
import java.util.List;

/**
 * The Class Java7FilterFindAnyAndOrElse.
 */
public class Java7FilterFindAnyAndOrElse {

	/**
	 * Filter example.
	 */
	public static void example() {
		List<Person> persons = Arrays.asList(new Person("mkyong"),
				new Person("michael"), new Person("lawrence"));

		System.out.println("Java7FilterFindAnyAndOrElse - JAVA 7 EXAMPLE:");
		
		Person result = getStudentByName(persons, "michael");
		
		System.out.println(result);
		
		System.out.println("**************************");
		System.out.println("");
	}
	
	 private static Person getStudentByName(List<Person> persons, String name) {

	        Person result = null;
	        for (Person temp : persons) {
	            if (name.equals(temp.getName())) {
	                result = temp;
	            }
	        }
	        return result;
	    }


}
