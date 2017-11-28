package pca.util.menus.opciones;

import pca.util.Nombrable;
import pca.util.menus.Auditor;

public class OVer extends OTipo {

	private static final String PREFIJO = "Ver ";

	public OVer(Nombrable tipo) {
		super(PREFIJO, tipo);
	}

	public void despachar(Auditor auditor) {
		auditor.auditar(this);
	}
}
