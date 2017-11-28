package pca.agenda.contactos.controladores;

import pca.agenda.contactos.menus.MenuContacto;
import pca.agenda.contactos.modelos.MContacto;
import pca.agenda.contactos.modelos.MDirectorio;
import pca.agenda.contactos.modelos.MPersona;
import pca.util.dialogos.DAceptar;
import pca.util.menus.TMenu;
import pca.util.menus.opciones.OAbrir;
import pca.util.menus.opciones.OBorrar;
import pca.util.menus.opciones.OEditar;
import pca.util.menus.opciones.OItem;
import pca.util.menus.opciones.OVer;

public class CAbrirContacto extends CContacto {

	public CAbrirContacto(MContacto mContacto) {
		super(mContacto);
		menuContacto = fabricaContactos.crearMenu(mContacto, this, TMenu.ABRIR);
	}

	public void controlar() {
		menuContacto.ejecutar();
		// despachos
	}

	public void auditar(OEditar oEditar) {
		CEditarContacto cEditarContacto = new CEditarContacto(mContacto);
		cEditarContacto.controlar();
	}

	public void auditar(OBorrar oBorrar) {
		CBorrarContacto cBorrarContacto = new CBorrarContacto(mContacto);
		cBorrarContacto.controlar();
		if (cBorrarContacto.borrado()) {
			menuContacto.salir();
		}
	}

	public void auditar(OAbrir oAbrir) {
		MenuContacto menuSeleccionar = fabricaContactos.crearMenu(mContacto,
				this, TMenu.SELECCIONAR);
		menuSeleccionar.ejecutar();
	}

	public void auditar(OVer oVer) {
		MPersona mPersonaAlternativa =
				((MPersona) mContacto).getContactoAlternativo();
		if (mPersonaAlternativa == null) {
			DAceptar dNoExiste = fabricaDialogos.crearDAceptar("ERROR:",
					"No existe persona de contacto alternativa!!!");
			dNoExiste.ejecutar();
		} else {
			MenuContacto menuVer = fabricaContactos.crearMenu(
					mPersonaAlternativa, this, TMenu.VER);
			menuVer.ejecutar();
		}
	}

	public void auditar(OItem oItem) {
		CAbrirContacto cAbrirContacto = new CAbrirContacto(
				((MDirectorio) mContacto).getMContacto(oItem.getPosicion()));
		cAbrirContacto.controlar();
	}
}
