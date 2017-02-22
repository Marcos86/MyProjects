package j8t.leccion8.predicates;

import java.util.List;
import java.util.function.Predicate;

/**
 * The Class EjemplosPredicates.
 * Link ejemplo:http://www.arquitecturajava.com/java-predicate-interface-y-sus-metodos/
 * 				http://www.arquitecturajava.com/utilizando-java-8-predicate/
 */
public class EjemplosPredicates {

	/**
	 * Mostrar lista.
	 *
	 * @param lista the lista
	 */
	protected void mostrarLista(List<Persona> lista) {
		System.out.println("CONTENIDO LISTA");
		lista.stream().forEach(p -> System.out.println(p));
		System.out.println();
		System.out.println("**********************************************************************");
		System.out.println("**********************************************************************");
		System.out.println();
		System.out.println();
	}

	/**
	 * Mostrar resultado al aplicar predicate.
	 *
	 * @param lista the lista
	 * @param titulo the titulo
	 * @param predicado the predicado
	 */
	protected void mostrarResultadoAlAplicarPredicate(List<Persona> lista, String titulo, Predicate<Persona> predicado) {
		System.out.println("--->>>RESULTADO PREDICATE -> [" + titulo + "] <<<---");	
		lista.stream().filter(predicado).forEach(p->System.out.println(p));
		System.out.println();
		System.out.println("**********************************************************************");
		System.out.println();
	}
}
