package j8t.leccion07_mixins.conceptoDefaultMethodInterface;

import java.lang.reflect.Field;

/**
 * The Interface InformacionObjeto.
 * Link Ejemplo: http://www.arquitecturajava.com/java-8-default-methods-y-extensibilidad/
 */
public interface InformacionObjeto {

	/**
	 * Imprimir propiedades objeto.
	 */
	default public void imprimirPropiedadesObjeto() {

		Field[] campos =this.getClass().getDeclaredFields();
		for(int i=0;i<campos.length;i++) {

			System.out.println(campos[i].getName());
		}

	}
}
