package j8t.leccion07_mixins.conceptoDefaultMethodInterface;


/**
 * The Class Factura.
 * Link ejemplo: http://www.arquitecturajava.com/java-8-default-methods-y-extensibilidad/
 */
public class Factura implements InformacionObjeto{

	/** The nombre. */
	public String nombre;

	/** The importe. */
	public int importe;

	/** The concepto. */
	public String concepto;

	/** The ClienteId. */
	public String clienteId;


	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * Gets the importe.
	 *
	 * @return the importe
	 */
	public int getImporte() {
		return importe;
	}



	/**
	 * Sets the importe.
	 *
	 * @param importe the new importe
	 */
	public void setImporte(int importe) {
		this.importe = importe;
	}



	/**
	 * Gets the concepto.
	 *
	 * @return the concepto
	 */
	public String getConcepto() {
		return concepto;
	}



	/**
	 * Sets the concepto.
	 *
	 * @param concepto the new concepto
	 */
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}



	/**
	 * Gets the clienteId.
	 *
	 * @return the clienteId
	 */
	public String getClienteId() {
		return clienteId;
	}



	/**
	 * Sets the clienteId.
	 *
	 * @param clienteId the new clienteId
	 */
	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"Person[nombre=%s, importe=%s, concepto=%s, clienteId=%s]",
				nombre, importe, concepto, clienteId);
	}

}