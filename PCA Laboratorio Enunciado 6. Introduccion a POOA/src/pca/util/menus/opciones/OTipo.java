package pca.util.menus.opciones;

import pca.util.Nombrable;

abstract class OTipo extends Opcion {

	private Nombrable tipo;

	OTipo(String prefijo, Nombrable tipo) {
		super(prefijo + tipo.getNombre());
		this.tipo = tipo;
	}

	public Nombrable getTipo() {
		return tipo;
	}
}

