package j8t.leccion09_predicates.highOrderFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * The Class HighOrderFunctionsExample.
 * Link ejemplo: http://www.arquitecturajava.com/utilizando-java-high-order-functions/
 */
public class HighOrderFunctionsExample {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		List<String> listaNombres = crearListaNombres();
		System.out.println("LISTADO DE NOMBRE INICIAL:");

		System.out.println("*************************************************************************");
		System.out.println("PREDICADOS CON HIGH ORDER FUNCTIONS");
		crearPredicadosConHighOrderFunctions(listaNombres);
		System.out.println("*************************************************************************");

		System.out.println("*************************************************************************");
		System.out.println("PREDICADOS CON HIGH ORDER FUNCTIONS GENERICO");
		crearPredicadosConHighOrderFunctionsGenerico(listaNombres);
		System.out.println("*************************************************************************");
	}

	/**
	 * Crear lista nombres.
	 *
	 * @return the list
	 */
	private static List<String> crearListaNombres() {
		List<String> listaNombres = new ArrayList<String>();

		listaNombres.add("Pedro");
		listaNombres.add("Miguel");
		listaNombres.add("Ana");
		listaNombres.add("Isabel");
		listaNombres.add("MariaPilar");

		return listaNombres;
	}

	/**
	 * Crear predicados con high order functions.
	 *
	 * @param listaNombres the lista nombres
	 */
	private static void crearPredicadosConHighOrderFunctions(List<String> listaNombres) {
		Predicate<String> filtro3 = (nombre) -> nombre.length() <= 3;
		System.out.println("PREDICADO PARA MOSTAR LOS NOMBRE CON 3 CARACTERES COMO MAXIMO DE LONGITUD");
		filtrarImprimirListaConPredicado(listaNombres, filtro3);

		System.out.println("PREDICADO PARA MOSTAR LOS NOMBRE CON 5 CARACTERES COMO MAXIMO DE LONGITUD");
		Predicate<String> filtro5 = (nombre) -> nombre.length() <= 5;
		filtrarImprimirListaConPredicado(listaNombres, filtro5);

		System.out.println("PREDICADO PARA MOSTAR LOS NOMBRE CON 7 CARACTERES COMO MAXIMO DE LONGITUD");
		Predicate<String> filtro7 = (nombre) -> nombre.length() <= 7;
		filtrarImprimirListaConPredicado(listaNombres, filtro7);

	}

	/**
	 * Filtrar imprimir lista con predicado.
	 *
	 * @param listaNombres the lista nombres
	 * @param filtro the filtro
	 */
	private static void filtrarImprimirListaConPredicado(List<String> listaNombres, Predicate<String> filtro) {
		listaNombres.stream().filter(filtro).forEach(nombre -> System.out.println(nombre));
		System.out.println();
	}


	/**
	 * Crear predicados con high order functions generico.
	 *
	 * @param listaNombres the lista nombres
	 */
	private static void crearPredicadosConHighOrderFunctionsGenerico(List<String> listaNombres) {
		System.out.println("PREDICADO PARA MOSTAR LOS NOMBRE CON 3 CARACTERES COMO MAXIMO DE LONGITUD");
		imprimir(listaNombres, System.out::println, 3);

		System.out.println("PREDICADO PARA MOSTAR LOS NOMBRE CON 5 CARACTERES COMO MAXIMO DE LONGITUD");
		imprimir(listaNombres, System.out::println, 5);

		System.out.println("PREDICADO PARA MOSTAR LOS NOMBRE CON 7 CARACTERES COMO MAXIMO DE LONGITUD");
		imprimir(listaNombres, System.out::println, 7);
	}



	/**
	 * Imprimir.
	 *
	 * @param listaNombres the lista nombres
	 * @param consumidor the consumidor
	 * @param size the size
	 */
	private static void imprimir (List<String>listaNombres, Consumer<String> consumidor, int size) {
		listaNombres.stream().filter(filtroSize(size)).forEach(consumidor);
		System.out.println();
	}

	/**
	 * Filtro size.
	 *
	 * @param longitud the longitud
	 * @return the predicate
	 */
	private static Predicate<String> filtroSize(final int longitud) {
		return texto -> texto.length() <= longitud;
	}

}
