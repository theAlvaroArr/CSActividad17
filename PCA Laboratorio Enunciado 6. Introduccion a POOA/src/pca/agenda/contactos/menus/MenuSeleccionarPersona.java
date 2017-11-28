package pca.agenda.contactos.menus;

import pca.agenda.contactos.fabricas.TContacto;
import pca.util.menus.TModoMenu;
import pca.util.menus.opciones.OSeleccionar;

public class MenuSeleccionarPersona extends MenuContacto {

	public MenuSeleccionarPersona() {
		super("SELECCIONAR PERSONA:", TModoMenu.ITERATIVO);
	}

	protected void configurar() {
		this.anyadir(new OSeleccionar(TContacto.PERSONA));
	}

	public MenuContacto copia() {
		return new MenuSeleccionarPersona();
	}
}
