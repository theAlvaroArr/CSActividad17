package pca.util.menus.opciones;

import pca.util.Nombrable;
import pca.util.menus.Auditor;

public class OBorrar extends OTipo {

	private static final String PREFIJO = "Borrar ";

	public OBorrar(Nombrable tipo) {
		super(PREFIJO, tipo);
	}

	public void despachar(Auditor auditor) {
		auditor.auditar(this);
	}
}
