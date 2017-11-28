package pca.agenda.contactos.menus;

import pca.agenda.contactos.fabricas.TContacto;
import pca.agenda.contactos.modelos.TCampoContacto;
import pca.util.menus.TModoMenu;
import pca.util.menus.opciones.OBorrar;
import pca.util.menus.opciones.OEditar;
import pca.util.menus.opciones.OVer;

public class MenuAbrirPersona extends MenuContacto {

	public MenuAbrirPersona() {
		super("PERSONA:", TModoMenu.ITERATIVO);
	}

	protected void configurar() {
		this.anyadir(new OEditar(TContacto.PERSONA));
		this.anyadir(new OBorrar(TContacto.PERSONA));
		this.anyadir(new OVer(TCampoContacto.CONTACTO_ALTERNATIVO));
	}

	public MenuContacto copia() {
		return new MenuAbrirPersona();
	}
}
