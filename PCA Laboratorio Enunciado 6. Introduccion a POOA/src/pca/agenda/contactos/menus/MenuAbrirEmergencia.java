package pca.agenda.contactos.menus;

import pca.agenda.contactos.fabricas.TContacto;
import pca.util.menus.TModoMenu;
import pca.util.menus.opciones.OBorrar;
import pca.util.menus.opciones.OEditar;

public class MenuAbrirEmergencia extends MenuContacto {

	public MenuAbrirEmergencia() {
		super("EMERGENCIA:", TModoMenu.ITERATIVO);
	}

	protected void configurar() {
		this.anyadir(new OEditar(TContacto.EMERGENCIA));
		this.anyadir(new OBorrar(TContacto.EMERGENCIA));
	}

	public MenuContacto copia() {
		return new MenuAbrirEmergencia();
	}
}
