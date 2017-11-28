package pca.agenda.contactos.menus;

import pca.agenda.contactos.modelos.TCampoContacto;
import pca.util.menus.TModoMenu;
import pca.util.menus.opciones.OBorrar;
import pca.util.menus.opciones.OEditar;

public class MenuEditarPersona extends MenuContacto {

	public MenuEditarPersona() {
		super("EDITAR PERSONA:", TModoMenu.ITERATIVO);
	}

	protected void configurar() {
		this.anyadir(new OEditar(TCampoContacto.NOMBRE));
		this.anyadir(new OEditar(TCampoContacto.TELEFONO));
		this.anyadir(new OEditar(TCampoContacto.CORREO));
		this.anyadir(new OEditar(TCampoContacto.DIRECCION));
		this.anyadir(new OEditar(TCampoContacto.CONTACTO_ALTERNATIVO));
		this.anyadir(new OBorrar(TCampoContacto.CONTACTO_ALTERNATIVO));
	}

	public MenuContacto copia() {
		return new MenuEditarPersona();
	}
}
