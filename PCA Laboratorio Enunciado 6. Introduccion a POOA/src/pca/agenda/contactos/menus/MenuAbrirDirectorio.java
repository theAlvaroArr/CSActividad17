package pca.agenda.contactos.menus;

import pca.agenda.contactos.fabricas.TContacto;
import pca.util.menus.TModoMenu;
import pca.util.menus.opciones.OAbrir;
import pca.util.menus.opciones.OBorrar;
import pca.util.menus.opciones.OEditar;

public class MenuAbrirDirectorio extends MenuContacto {

	public MenuAbrirDirectorio() {
		super("DIRECTORIO:", TModoMenu.ITERATIVO);
	}

	protected void configurar() {
		this.anyadir(new OEditar(TContacto.DIRECTORIO));
		this.anyadir(new OBorrar(TContacto.DIRECTORIO));
		this.anyadir(new OAbrir(TContacto.DIRECTORIO));
	}

	public MenuContacto copia() {
		return new MenuAbrirDirectorio();
	}
}
