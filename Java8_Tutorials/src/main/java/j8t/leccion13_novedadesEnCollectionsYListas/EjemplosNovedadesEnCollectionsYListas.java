package j8t.leccion13_novedadesEnCollectionsYListas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * The Class EjemplosNovedadesEnCollectionsYListas.
 * Link ejemplo: http://www.arquitecturajava.com/novedades-de-java-8-collections-y-listas/
 */
public class EjemplosNovedadesEnCollectionsYListas {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		List<Factura> facturas = crearListaFacturas();

		
		System.out.println("Listado de facturas: ");
		pintarListado(facturas);
		espaciarCaso();

		
		System.out.println("Resultado reordenar la lista por el importe de las facturas");
		ordenarPorImporteFacturas(facturas);
		pintarListado(facturas);
		espaciarCaso();

		
		System.out.println("Resultado reordenar la lista por el numero de factura");
		ordenarPorNumeroFacturas(facturas);
		pintarListado(facturas);
		espaciarCaso();

		
		System.out.println("Resultado reordenar la lista por el concepto de factura");
		ordenarPorConceptoFacturas(facturas);
		pintarListado(facturas);
		espaciarCaso();


		System.out.println("Resultado reordenar la lista por el cliente de factura");
		ordenarPorClienteFacturas(facturas);
		pintarListado(facturas);
		espaciarCaso();
		
		
		System.out.println("Resultado tras borrar el cliente A...");
		eliminarClienteA(facturas);
		pintarListado(facturas);
		espaciarCaso();
		
		
		System.out.println("Resultado tras borrar facturas superiores a 100 euros");
		System.out.println("(sin contar el cliente A que ha sido borrado de la lista en la operacion anterior)");
		eliminarFacturasSuperiores100Euros(facturas);
		pintarListado(facturas);
		espaciarCaso();
	}


	/**
	 * Crear lista facturas.
	 *
	 * @return the list
	 */
	public static List<Factura> crearListaFacturas () {	
		ArrayList<Factura> lista= new ArrayList<Factura>();
		Factura f1 = new Factura("1",200,"telefono","clienteA");
		Factura f2 = new Factura("2",500,"impresora","clienteB");
		Factura f3 = new Factura("3",400,"impresora","clienteC");
		Factura f4 = new Factura("4",1000,"ordenador","clienteA");
		Factura f5 = new Factura("5",25,"teclado","clienteD");
		Factura f6 = new Factura("6",100,"pantalla","clienteE");

		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		lista.add(f4);
		lista.add(f5);
		lista.add(f6);

		return lista;
	}

	/**
	 * Pintar listado.
	 *
	 * @param facturas the facturas
	 */
	private static void pintarListado(List<Factura> facturas) {
		facturas.stream().forEach(f -> System.out.println(f));
	}


	/**
	 * Ordenar por importe facturas.
	 *
	 * @param facturas the facturas
	 */
	private static void ordenarPorImporteFacturas(List<Factura> facturas) {
		facturas.sort(Comparator.comparing(Factura::getImporte));
	}


	/**
	 * Ordenar por numero facturas.
	 *
	 * @param facturas the facturas
	 */
	private static void ordenarPorNumeroFacturas(List<Factura> facturas) {
		facturas.sort(Comparator.comparing(Factura::getNombre));
	}


	/**
	 * Ordenar por concepto facturas.
	 *
	 * @param facturas the facturas
	 */
	private static void ordenarPorConceptoFacturas(List<Factura> facturas) {
		facturas.sort(Comparator.comparing(Factura::getConcepto));
	}


	/**
	 * Ordenar por cliente facturas.
	 *
	 * @param facturas the facturas
	 */
	private static void ordenarPorClienteFacturas(List<Factura> facturas) {
		facturas.sort(Comparator.comparing(Factura::getClienteId));
	}
	
	

	/**
	 * Eliminar cliente A.
	 *
	 * @param facturas the facturas
	 */
	private static void eliminarClienteA(List<Factura> facturas) {
		facturas.removeIf (f -> f.getClienteId().equals("clienteA"));
	}


	/**
	 * Eliminar facturas superiores 100 euros.
	 *
	 * @param facturas the facturas
	 */
	private static void eliminarFacturasSuperiores100Euros(List<Factura> facturas) {
		facturas.removeIf (f -> f.getImporte() > 100);	
	}
	
	/**
	 * Espaciar caso.
	 */
	private static void espaciarCaso() {
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
	}

}
