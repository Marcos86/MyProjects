package j8t.leccion07_mixins;

/**
 * The Class Java8MixinsExample.
 * Link ejemplo: http://www.arquitecturajava.com/java-mixins-un-ejemplo-sencillo/
 */
public class Java8MixinsExample {
	 
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        Mesa mesa = new Mesa();
        mesa.plegar();
        
        Silla silla = new Silla();
        silla.plegar();
        
        Banco banco = new Banco();
        banco.plegar();
 
    }
 
}
