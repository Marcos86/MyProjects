package j8t.leccion01_streams.concepto;

import java.util.List;
import java.util.function.Predicate;

/**
 * The Class AnalizadorPredicados.
 * Link ejemplo: http://www.arquitecturajava.com/java-8-stream-y-workflow/
 */
public class AnalizadorPredicados {


	public static void trazarPrimeraFacturaConIgualOMasDe300Euros(List<Factura> listaFacturas) {

		System.out.println("AnalizadorPredicados -> Vamos a evaluar un predicado de primera factura con importe > 300 sobre la lista");
		System.out.println();

		System.out.println("Comienza el predicado...");
		Predicate<Factura> predicado= new Predicate<Factura>() {

			@Override
			public boolean test(Factura f) {
				System.out.println(" Estamos en una iteracion evaluando la factura: " + f);
				return f.getImporte()>300;
			}
		};

		//Se ve como tras encontrar un elemento no se sigue recorriendo la lista

		Factura facturaFiltro=listaFacturas.stream().filter(predicado).findFirst().get();

		System.out.println("RESULTADO: "+facturaFiltro);
		System.out.println();
	}
	
	
	public static void trazarPrimeraFacturaConMasDe300Euros(List<Factura> listaFacturas) {

		System.out.println("AnalizadorPredicados -> Vamos a evaluar un predicado de primera factura con importe >=300 sobre la lista");
		System.out.println();

		System.out.println("Comienza el predicado...");
		Predicate<Factura> predicado= new Predicate<Factura>() {

			@Override
			public boolean test(Factura f) {
				System.out.println(" Estamos en una iteracion evaluando la factura: " + f);
				return f.getImporte()>=300;
			}
		};

		//Se ve como tras encontrar un elemento no se sigue recorriendo la lista
		Factura facturaFiltro=listaFacturas.stream().filter(predicado).findFirst().get();

		System.out.println("RESULTADO: "+facturaFiltro);
		System.out.println();
	}



	/**
	 * Trazar predicado varios elementos para ver funcionamiento.
	 *
	 * @param listaFacturas the lista facturas
	 */
	public static void trazarTodasFacturasConIgualOMasDe300Euros(List<Factura> listaFacturas) {

		System.out.println("AnalizadorPredicados -> Vamos a evaluar un predicado de facturas con importe >= 300 sobre la lista");
		System.out.println();

		System.out.println("Comienza el predicado...");
		Predicate<Factura> predicado= new Predicate<Factura>() {

			@Override
			public boolean test(Factura f) {
				System.out.println(" Estamos en una iteracion evaluando la factura: " + f);
				return f.getImporte()>=300;
			}
		};

		System.out.println("RESULTADO: ");
		listaFacturas.stream().filter(predicado).forEach(f->System.out.println(f));

		System.out.println();
		System.out.println();
	}


	public static void trazarTodasFacturasConMasDe300Euros(List<Factura> listaFacturas) {
		System.out.println("AnalizadorPredicados -> Vamos a evaluar un predicado de facturas con importe > 300 sobre la lista");;
		System.out.println();

		System.out.println("Comienza el predicado...");
		Predicate<Factura> predicado= new Predicate<Factura>() {

			@Override
			public boolean test(Factura f) {
				System.out.println(" Estamos en una iteracion evaluando la factura: " + f);
				return f.getImporte()>300;
			}
		};

		System.out.println("RESULTADO: ");
		listaFacturas.stream().filter(predicado).forEach(f->System.out.println(f));
		
		System.out.println();
		
	}

}
