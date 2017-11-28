package pca.util.menus.opciones;

import pca.util.menus.Auditor;
import pca.util.menus.Menu;

public class OSalir extends Opcion {

	private static final String TITULO = "Salir";
	private Menu menu;

	public OSalir(Menu menu) {
		super(OSalir.TITULO);
		this.menu = menu;
	}

	public void despachar(Auditor auditor) {
		menu.salir();
		auditor.auditar(this);
	}
}
