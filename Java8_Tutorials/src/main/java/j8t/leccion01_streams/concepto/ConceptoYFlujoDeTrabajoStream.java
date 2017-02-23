package j8t.leccion01_streams.concepto;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class ConceptoYFlujoDeTrabajoStream.
 * Link ejemplo: http://www.arquitecturajava.com/java-8-stream-y-workflow/
 */
public class ConceptoYFlujoDeTrabajoStream {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		List<Factura> listaFacturas = crearListadoFacturas();
		
		// Primera factura con igual o mas de 300
		generarTrazaInicioPredicado("CASO 1: PREDICADO = PRIMERA FACTURA CON IGUAL O MAS DE 300", listaFacturas);
		GeneradorFiltros.buscarPrimeraFacturaConIgualOMasDe300Euros (listaFacturas);
		AnalizadorPredicados.trazarPrimeraFacturaConIgualOMasDe300Euros(listaFacturas);
		espaciarCaso();

		// Primera factura con mas de 300
		generarTrazaInicioPredicado("CASO 2: PREDICADO = PRIMERA FACTURA CON MAS DE 300", listaFacturas);
		GeneradorFiltros.buscarPrimeraFacturaConMasDe300Euros (listaFacturas);
		AnalizadorPredicados.trazarPrimeraFacturaConMasDe300Euros(listaFacturas);
		espaciarCaso();
		
		// Todas las facturas con igual o mas de 300
		generarTrazaInicioPredicado("CASO 3: PREDICADO = TODAS LAS FACTURAS CON IGUAL O MAS DE 300", listaFacturas);
		GeneradorFiltros.buscarTodasFacturasConIgualOMasDe300Euros (listaFacturas);
		AnalizadorPredicados.trazarTodasFacturasConIgualOMasDe300Euros(listaFacturas);
		espaciarCaso();
		
		// Todas las facturas con mas de 300
		generarTrazaInicioPredicado("CASO 4: PREDICADO = TODAS LAS FACTURAS CON  MAS DE 300", listaFacturas);
		GeneradorFiltros.buscarTodasFacturasConMasDe300Euros (listaFacturas);
		AnalizadorPredicados.trazarTodasFacturasConMasDe300Euros(listaFacturas);
		espaciarCaso();
	}

	/**
	 * Generar traza inicio predicado.
	 *
	 * @param traza the traza
	 * @param listadoFacturas the listado facturas
	 */
	private static void generarTrazaInicioPredicado(String traza, List<Factura> listadoFacturas) {
		System.out.println(traza);
		System.out.println();
		System.out.println("Listado de facturas sin filtro:");
		listadoFacturas.stream().forEach(f -> System.out.println(f));		
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println();
	}

	/**
	 * Espaciar caso.
	 */
	private static void espaciarCaso() {
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
	}

	/**
	 * Crear listado facturas.
	 *
	 * @return the list
	 */
	private static List<Factura> crearListadoFacturas() {
		Factura f= new Factura("ordenador",1000);
		Factura f2= new Factura("movil",300);
		Factura f3= new Factura("impresora",200);
		Factura f4= new Factura("imac",1500);

		List<Factura> lista = new ArrayList<Factura>();

		lista.add(f);
		lista.add(f2);
		lista.add(f3);
		lista.add(f4);

		return lista;
	}

}
