package j8t.leccion03_streams.filterFindAnyAndRrElse;

import java.util.Arrays;
import java.util.List;

/**
 * The Class Java8FilterFindAnyAndOrElse.
 */
public class Java8FilterFindAnyAndOrElse {
	
	/**
	 * Example single condition.
	 */
	public static void exampleSingleCondition() {
		List<Person> persons = Arrays.asList(new Person("mkyong"),
				new Person("michael"), new Person("lawrence"));

		System.out.println("Java8FilterFindAnyAndOrElse - exampleSingleCondition - JAVA 8 EXAMPLE:");
		
		Person result = persons.stream()				   // Convert to steam
			.filter(x -> "michael".equals(x.getName()))	// we want "michael" only
			.findAny()									// If 'findAny' then return found
			.orElse(null);	
		
		System.out.println(result);
		
		System.out.println("**************************");
		System.out.println("");
	}
	
	
	/**
	 * Example multiple condition.
	 */
	public static void exampleMultipleCondition() {
		
		List<Person> persons = Arrays.asList(new Person("mkyong", 20),
				new Person("michael", 21), new Person("lawrence", 23));
		
			System.out.println("Java8FilterFindAnyAndOrElse - exampleMultipleCondition - JAVA 8 EXAMPLE 1:");

			Person result = persons.stream()
				.filter((x) -> "michael".equals(x.getName()) && 21==x.getAge())
				.findAny()
				.orElse(null);
			
			System.out.println(result);
			
			System.out.println("**************************");
			System.out.println("");
			
			System.out.println("Java8FilterFindAnyAndOrElse - exampleMultipleCondition - JAVA 8 EXAMPLE 2:");

			//or like this
			Person result2 = persons.stream()
				.filter(x -> {
					if("michael".equals(x.getName()) && 21==x.getAge()){
						return true;
					}
					return false;
				}).findAny()
				.orElse(null);
			
			System.out.println(result2);
			
			System.out.println("**************************");
			System.out.println("");
		
	}
	
	
	/**
	 * Example filter and map.
	 */
	public static void exampleFilterAndMap() {
		
		
			System.out.println("Java8FilterFindAnyAndOrElse - exampleFilterAndMap - JAVA 8 EXAMPLE:");

			List<Person> persons = Arrays.asList(new Person("mkyong", 20),
					new Person("michael", 21), new Person("lawrence", 23));

				String name = persons.stream()
					.filter(x -> "michael".equals(x.getName()))
					.map(Person::getName)						//convert stream to String
					.findAny()
					.orElse("");

			System.out.println(name);	
			System.out.println("**************************");
			System.out.println("");	
		
	}

}
