package j8t.leccion09_predicates.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * The Class PredicatesExample.
 * Link ejemplo:http://www.arquitecturajava.com/java-predicate-interface-y-sus-metodos/
 */
public class EjemplosPredicatesCombinados extends EjemplosPredicates{

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		List<Persona> lista= new ArrayList<Persona>();

		Persona p1= new Persona ("pepe","perez",20);
		Persona p2= new Persona ("ana","perez",30);
		Persona p3= new Persona ("gema","sanchez",40);
		Persona p4= new Persona ("pedro","gomez",70);

		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);

		EjemplosPredicatesCombinados preCombinados = new EjemplosPredicatesCombinados();
		preCombinados.mostrarLista(lista);
		preCombinados.ejemploPredicados1(lista);
		preCombinados.ejemploPredicados2(lista);

	}


	/**
	 * Ejemplo predicados 1.
	 *
	 * @param lista the lista
	 */
	private void ejemploPredicados1(List<Persona> lista) {
		Predicate<Persona> predicado1 = p->p.getEdad()>18;
		Predicate<Persona> predicado2 = p->p.getEdad()<30;
		// El predicado3 devuelve como resultado pepe perez (20 años)
		Predicate<Persona> predicado3= predicado1.and(predicado2);
		mostrarResultadoAlAplicarPredicate(lista, "EDAD>18&&EDAD<30", predicado3);

		// El predicado4 devuelve como resultado pedro gomez (70 años)
		Predicate<Persona> predicado4 = p->p.getEdad()>65;
		mostrarResultadoAlAplicarPredicate(lista, "EDAD>65",predicado4);

		// El predicado6 devuelve como resultado todo lo que no sea predicado3 o predicado4 => ana perez (30), gema sanchez (40 años)
		Predicate<Persona> predicado5 = predicado3.or(predicado4);
		mostrarResultadoAlAplicarPredicate(lista, "(EDAD>18&&EDAD<30) || (EDAD>65)", predicado5);
		Predicate<Persona> predicado6 = predicado5.negate();
		
		mostrarResultadoAlAplicarPredicate(lista, "NO ((EDAD>18&&EDAD<30) || (EDAD>65))", predicado6);
	}

	/**
	 * Ejemplo predicados 2.
	 *
	 * @param lista the lista
	 */
	private void ejemploPredicados2(List<Persona> lista) {
		// Que el nombre tenga 4 letras o menos y que tenga mas de 25 años -> ana perez (30 años) y gema sanchez (40 años)
		Predicate<Persona> predicado1 = p->p.getNombre().length()<=4;
		Predicate<Persona> predicado2 = p->p.getEdad()>25;
		Predicate<Persona> predicado3 = predicado1.and(predicado2);
		mostrarResultadoAlAplicarPredicate(lista, "LONGITUD (NOMBRE) <=4 && EDAD>25", predicado3);
		
		// que el apellido sea contenga "ez" y sea menor de 35 años -> pepe perez (20 años) y ana perez (30 años)
		Predicate<Persona> predicado4 = p->p.getApellidos().contains("ez");
		Predicate<Persona> predicado5 = p->p.getEdad()<35;
		Predicate<Persona> predicado6 = predicado4.and(predicado5);
		mostrarResultadoAlAplicarPredicate(lista, "APELLIDO LIKE ez && EDAD<35", predicado6);
		
		// Que se cumplan las dos anteriores -> ana perez (30 años)
		Predicate<Persona> predicado7 = predicado3.and(predicado6);
		mostrarResultadoAlAplicarPredicate(lista, "(LONGITUD (NOMBRE) <=4 && EDAD>25) AND (APELLIDO LIKE ez && EDAD<35)", predicado7);
		
		// Que se cumpla alguno de los dos anteriores -> pepe perez (20 años) , ana perez (30 años) y gema sanchez (40 años)
		Predicate<Persona> predicado8 = predicado3.or(predicado6);
		mostrarResultadoAlAplicarPredicate(lista, "(LONGITUD (NOMBRE) <=4 && EDAD>25) OR (APELLIDO LIKE ez && EDAD<35)", predicado8);
		

	}

}
