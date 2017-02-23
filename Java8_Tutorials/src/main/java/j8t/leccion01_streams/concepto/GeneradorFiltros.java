package j8t.leccion01_streams.concepto;

import java.util.List;

/**
 * The Class GeneradorFiltros.
 * Link ejemplo: http://www.arquitecturajava.com/java-8-stream-y-workflow/
 */
public class GeneradorFiltros {
	
	/**
	 * Buscar primera factura con igual O mas de 300 euros.
	 *
	 * @param listaFacturas the lista facturas
	 */
	public static void buscarPrimeraFacturaConIgualOMasDe300Euros(List<Factura> listaFacturas) {

		System.out.println("GeneradorFiltros -> Esto es un filtro para encontrar la primera factura con igual o mas de 300 euros");
		Factura facturaFiltro=
				listaFacturas.stream()
				.filter(elemento->elemento.getImporte()>=300).findFirst().get();

		System.out.println(facturaFiltro);
		System.out.println();
	}

	/**
	 * Primer filtro sobre lista.
	 *
	 * @param listaFacturas the lista facturas
	 */
	public static void buscarPrimeraFacturaConMasDe300Euros(List<Factura> listaFacturas) {

		System.out.println("GeneradorFiltros -> Esto es un filtro para encontrar la primera factura con mas de 300 euros");
		Factura facturaFiltro=
				listaFacturas.stream()
				.filter(elemento->elemento.getImporte()>300).findFirst().get();

		System.out.println(facturaFiltro);
		System.out.println();
	}


	/**
	 * Buscar todas facturas con igual O mas de 300 euros.
	 *
	 * @param listaFacturas the lista facturas
	 */
	public static void buscarTodasFacturasConIgualOMasDe300Euros(List<Factura> listaFacturas) {

		System.out.println("GeneradorFiltros -> Esto es un filtro para encontrar todas las facturas con igual o mas de 300 euros");

		listaFacturas.stream()
		.filter(elemento->elemento.getImporte()>=300)
		.forEach(f -> System.out.println(f));

		System.out.println();
	}


	/**
	 * Buscar todas facturas con mas de 300 euros.
	 *
	 * @param listaFacturas the lista facturas
	 */
	public static void buscarTodasFacturasConMasDe300Euros(List<Factura> listaFacturas) {

		System.out.println("GeneradorFiltros -> Esto es un filtro para encontrar todas las facturas con mas de 300 euros");

		listaFacturas.stream()
		.filter(elemento->elemento.getImporte()>300)
		.forEach(f -> System.out.println(f));

		System.out.println();
	}


}
