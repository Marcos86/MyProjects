package j8t.leccion8_predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * The Class EjemplosPredicatesSimples.
 * Link ejemplo:http://www.arquitecturajava.com/utilizando-java-8-predicate/
 */
public class EjemplosPredicatesSimples extends EjemplosPredicates{

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		List<Persona> lista= new ArrayList<Persona>();

		Persona p1 = new Persona("pepe", "perez", 20);
		Persona p2 = new Persona("angel", "sanchez", 30);
		Persona p3 = new Persona("pepe", "blanco", 40);

		lista.add(p1);
		lista.add(p2);
		lista.add(p3);

		EjemplosPredicatesSimples preSimples = new EjemplosPredicatesSimples();
		preSimples.mostrarLista(lista);
		preSimples.recorrerUnaListaConStreams(lista);

		Predicate<Persona> predicate = preSimples.crearPredicate();
		preSimples.filtrarListaConPredicate(lista, predicate);

	}


	/**
	 * Recorrer una lista con streams.
	 *
	 * @param lista the lista
	 */
	private void recorrerUnaListaConStreams (List<Persona> lista) {
		System.out.println("Recorriendo lista con streams y consumer");
		lista.stream().forEach(new Consumer<Persona>() {
			@Override
			public void accept(Persona p) {
				System.out.println(p);
			}

		});
		System.out.println("******************************************");
		System.out.println();
	}



	/**
	 * Crear predicate.
	 *
	 * @return the predicate
	 */
	private Predicate<Persona> crearPredicate () {
		Predicate<Persona> predicadoNombreIgualAPepe = new Predicate<Persona>() {
			@Override
			public boolean test(Persona p) {
				return p.getNombre().equals("pepe");
			}
		};
		return predicadoNombreIgualAPepe;
	}



	/**
	 * Filtrar lista con predicate.
	 *
	 * @param lista the lista
	 * @param predicate the predicate
	 */
	private void filtrarListaConPredicate(List<Persona> lista, Predicate<Persona> predicate) {
		System.out.println("Recorriendo lista tras aplicar predicate de nombre=pepe");
		lista.stream().filter(predicate).forEach (p -> System.out.println(p));
		System.out.println("******************************************");
		System.out.println();
	}



}
