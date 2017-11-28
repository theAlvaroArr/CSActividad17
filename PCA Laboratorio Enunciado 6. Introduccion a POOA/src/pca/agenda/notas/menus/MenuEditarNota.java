package pca.agenda.notas.menus;

import pca.agenda.notas.vistas.VNota;
import pca.util.menus.TModoMenu;

public class MenuEditarNota extends MenuNota {

	public MenuEditarNota() {
		super("EDITAR NOTA:", TModoMenu.ESCAPE);
	}

	protected void configurar() {
	}

	public void ejecutar() {
		((VNota) vista).recoger();
	}

	public MenuNota copia() {
		return new MenuEditarNota();
	}
}
