package pca.agenda.contactos.menus;

import pca.agenda.contactos.fabricas.TContacto;
import pca.agenda.contactos.modelos.TCampoContacto;
import pca.util.menus.TModoMenu;
import pca.util.menus.opciones.OAnyadir;
import pca.util.menus.opciones.OEditar;

public class MenuEditarDirectorio extends MenuContacto {

	public MenuEditarDirectorio() {
		super("EDITAR DIRECTORIO:", TModoMenu.ITERATIVO);
	}

	protected void configurar() {
		this.anyadir(new OEditar(TCampoContacto.NOMBRE));
		this.anyadir(new OAnyadir(TContacto.CONTACTO));
	}

	public MenuContacto copia() {
		return new MenuEditarDirectorio();
	}
}

