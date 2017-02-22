package j8t.leccion10_flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * The Class RecorridoEstructura.
 * Link ejemplo:http://www.arquitecturajava.com/java-8-flatmap/
 */
public class RecorridoEstructuraPersonaViaje {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		List<Persona> listado = crearLista();
		
		conJava7(listado);
		conJava8Map(listado);
		conJava8FlatMap(listado);
		conJava8FlatMapOptimizado(listado);

	}

	/**
	 * Crear lista.
	 *
	 * @return the list
	 */
	public static List<Persona> crearLista() {
		Persona p= new Persona("pedro");
		Viaje v= new Viaje("Francia");
		Viaje v2= new Viaje("Inglaterra");
		p.addViaje(v);
		p.addViaje(v2);
		Persona p1= new Persona ("gema");
		Viaje v3= new Viaje("Italia");
		Viaje v4= new Viaje("Belgica");
		p1.addViaje(v3);
		p1.addViaje(v4);

		List<Persona> lista= new ArrayList<Persona>();
		lista.add(p);
		lista.add(p1);

		return lista;
	}

	/**
	 * Con java 7.
	 *
	 * @param lista the lista
	 */
	private static void conJava7(List<Persona> lista) {
		System.out.println("Mostrar listado de paises con Java 7");
		for(Persona persona:lista) {
			for (Viaje viaje: persona.getLista()) {
				System.out.println(viaje.getPais());
			}
		}
		System.out.println("**********************************");
		System.out.println("");

	}


	/**
	 * Con java 8 map.
	 *
	 * @param lista the lista
	 */
	private static void conJava8Map(List<Persona> lista) {
		System.out.println("Mostrar nombres de personas con Java8 - Map");
		lista.stream().
		map(persona->persona.getNombre()).
		forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		System.out.println("**********************************");
		System.out.println("");
	}


	/**
	 * Con java 8 flat map.
	 *
	 * @param lista the lista
	 */
	private static void conJava8FlatMap(List<Persona> lista) {
		System.out.println("Mostrar listado de paises con Java8 - Map && FlatMap");
		lista.stream().
		map(persona->persona.getLista()).
		flatMap(viajes->viajes.stream()).
		forEach(new Consumer<Viaje>() {
			@Override
			public void accept(Viaje t) {

				System.out.println(t.getPais());
			}
		});
		System.out.println("**********************************");
		System.out.println("");

	}


	/**
	 * Con java 8 flat map optimizado.
	 *
	 * @param lista the lista
	 */
	private static void conJava8FlatMapOptimizado(List<Persona> lista) {
		System.out.println("Mostrar listado de paises con Java8 Map && FlatMap Optimizado");
		lista.stream().
		map(persona -> persona.getLista()).
		flatMap(viajes -> viajes.stream()).
		map(viaje->viaje.getPais()).
		forEach(System.out::println);
		System.out.println("**********************************");
		System.out.println("");

	}

}
