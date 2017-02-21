package j8t.leccion3_streams.filtermap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The Class JavavsJava8FilterMap.
 * Link ejemplo: https://www.mkyong.com/java8/java-8-filter-a-map-examples/
 */

public class Java7vsJava8FilterMap {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

        Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");

        String result = "";
        for (Map.Entry<Integer, String> entry : HOSTING.entrySet()) {
            if ("aws.amazon.com".equals(entry.getValue())) {
                result = entry.getValue();
            }
        }
        System.out.println("Antes de Java 8 : " + result);

		//Map -> Stream -> Filter -> String
        result = HOSTING.entrySet().stream()
                .filter(map -> "aws.amazon.com".equals(map.getValue()))
                .map(map -> map.getValue())
                .collect(Collectors.joining());

        System.out.println("Ahora con Java 8 : " + result);

    }

}
