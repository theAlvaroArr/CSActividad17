package pca.util.menus.opciones;

import pca.util.Nombrable;
import pca.util.menus.Auditor;

public class OAnyadir extends OTipo {

	private static final String PREFIJO = "Anyadir ";

	public OAnyadir(Nombrable tipo) {
		super(PREFIJO, tipo);
	}

	public void despachar(Auditor auditor) {
		auditor.auditar(this);
	}
}
