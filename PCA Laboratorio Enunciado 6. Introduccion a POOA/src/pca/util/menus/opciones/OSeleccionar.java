package pca.util.menus.opciones;

import pca.util.Nombrable;
import pca.util.menus.Auditor;

public class OSeleccionar extends OTipo {

	private static final String PREFIJO = "Seleccionar ";

	public OSeleccionar(Nombrable tipo) {
		super(PREFIJO, tipo);
	}

	public void despachar(Auditor auditor) {
		auditor.auditar(this);
	}
}
