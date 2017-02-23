package j8t.leccion07_mixins.conceptoDefaultMethodInterface;

/**
 * The Class EjemploConceptoDefaultMethodInterface.
 * Link ejemplo: http://www.arquitecturajava.com/java-8-default-methods-y-extensibilidad/
 */
public class EjemploConceptoDefaultMethodInterface {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Persona p = new Persona();
		System.out.println("Propiedades definidas en la clase: " + p.getClass().getName());
		p.imprimirPropiedadesObjeto();
		espaciarCaso();
		
		Factura f = new Factura();
		System.out.println("Propiedades definidas en la clase: " + f.getClass().getName());
		f.imprimirPropiedadesObjeto();
		espaciarCaso();

	}
	
	private static void espaciarCaso() {
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println();
	}

}
