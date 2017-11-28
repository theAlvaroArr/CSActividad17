package pca.agenda.contactos.menus;

import pca.util.menus.TModoMenu;

public class MenuVerContacto extends MenuContacto {

	public MenuVerContacto() {
		super("VER CONTACTO:", TModoMenu.ESCAPE);
	}

	protected void configurar() {
	}

	public MenuContacto copia() {
		return new MenuVerContacto();
	}
}
