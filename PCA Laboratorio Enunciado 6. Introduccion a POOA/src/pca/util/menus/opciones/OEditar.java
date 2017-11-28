package pca.util.menus.opciones;

import pca.util.Nombrable;
import pca.util.menus.Auditor;

public class OEditar extends OTipo {

	private static final String PREFIJO = "Editar ";

	public OEditar(Nombrable tipo) {
		super(PREFIJO, tipo);
	}

	public void despachar(Auditor auditor) {
		auditor.auditar(this);
	}
}
