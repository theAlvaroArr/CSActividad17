package pca.util.menus.opciones;

import pca.util.menus.Auditor;

public class OItem extends Opcion {

	private int posicion;

	public OItem(int posicion, String titulo) {
		super(titulo);
		this.posicion = posicion;
	}

	public void despachar(Auditor auditor) {
		auditor.auditar(this);
	}

	public int getPosicion() {
		return posicion;
	}
}
