package pca.agenda.contactos.menus;

import pca.agenda.contactos.modelos.TCampoContacto;
import pca.util.menus.TModoMenu;
import pca.util.menus.opciones.OEditar;

public class MenuEditarEmergencia extends MenuContacto {

	public MenuEditarEmergencia() {
		super("EDITAR EMERGENCIA:", TModoMenu.ITERATIVO);
	}

	protected void configurar() {
		this.anyadir(new OEditar(TCampoContacto.NOMBRE));
		this.anyadir(new OEditar(TCampoContacto.TELEFONO));
	}

	public MenuContacto copia() {
		return new MenuEditarEmergencia();
	}
}
