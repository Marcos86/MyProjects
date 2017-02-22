package j8t.leccion6.mixins;

/**
 * The Class Banco.
 * Link ejemplo: http://www.arquitecturajava.com/java-mixins-un-ejemplo-sencillo/
 */
public class Banco extends Mueble implements Plegable{
	
	/* (non-Javadoc)
	 * @see j8t.leccion6.mixings.Plegable#plegar()
	 */
	@Override
    public void plegar() {
        
        System.out.println("este mueble se pliega diferente a lo normal");
    }

}
