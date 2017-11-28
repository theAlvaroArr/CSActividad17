package pca.agenda.notas.menus;

import pca.agenda.notas.fabricas.TNota;
import pca.util.menus.TModoMenu;
import pca.util.menus.opciones.OBorrar;
import pca.util.menus.opciones.OEditar;

public class MenuAbrirNota extends MenuNota {

	public MenuAbrirNota() {
		super("NOTA:", TModoMenu.ITERATIVO);
	}

	protected void configurar() {
		this.anyadir(new OEditar(TNota.NOTA));
		this.anyadir(new OBorrar(TNota.NOTA));
	}

	public MenuNota copia(){
		return new MenuAbrirNota();
	}
}
